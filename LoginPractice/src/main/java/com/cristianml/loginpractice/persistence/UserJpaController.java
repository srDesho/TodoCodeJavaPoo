package com.cristianml.loginpractice.persistence;

import java.io.Serializable;
import javax.persistence.Query;
import javax.persistence.EntityNotFoundException;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import com.cristianml.loginpractice.logic.Role;
import com.cristianml.loginpractice.logic.User;
import com.cristianml.loginpractice.persistence.exceptions.NonexistentEntityException;
import com.cristianml.loginpractice.persistence.exceptions.PreexistingEntityException;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class UserJpaController implements Serializable {

    public UserJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    
    public UserJpaController() {
        emf = Persistence.createEntityManagerFactory("loginPU");
    }
    
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(User user) throws PreexistingEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Role unRole = user.getUnRole();
            if (unRole != null) {
                unRole = em.getReference(unRole.getClass(), unRole.getId());
                user.setUnRole(unRole);
            }
            em.persist(user);
            if (unRole != null) {
                unRole.getUserList().add(user);
                unRole = em.merge(unRole);
            }
            em.getTransaction().commit();
        } catch (Exception ex) {
            if (findUser(user.getId()) != null) {
                throw new PreexistingEntityException("User " + user + " already exists.", ex);
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(User user) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            User persistentUser = em.find(User.class, user.getId());
            Role unRoleOld = persistentUser.getUnRole();
            Role unRoleNew = user.getUnRole();
            if (unRoleNew != null) {
                unRoleNew = em.getReference(unRoleNew.getClass(), unRoleNew.getId());
                user.setUnRole(unRoleNew);
            }
            user = em.merge(user);
            if (unRoleOld != null && !unRoleOld.equals(unRoleNew)) {
                unRoleOld.getUserList().remove(user);
                unRoleOld = em.merge(unRoleOld);
            }
            if (unRoleNew != null && !unRoleNew.equals(unRoleOld)) {
                unRoleNew.getUserList().add(user);
                unRoleNew = em.merge(unRoleNew);
            }
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                int id = user.getId();
                if (findUser(id) == null) {
                    throw new NonexistentEntityException("The user with id " + id + " no longer exists.");
                }
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void destroy(int id) throws NonexistentEntityException {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            User user;
            try {
                user = em.getReference(User.class, id);
                user.getId();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The user with id " + id + " no longer exists.", enfe);
            }
            Role unRole = user.getUnRole();
            if (unRole != null) {
                unRole.getUserList().remove(user);
                unRole = em.merge(unRole);
            }
            em.remove(user);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<User> findUserEntities() {
        return findUserEntities(true, -1, -1);
    }

    public List<User> findUserEntities(int maxResults, int firstResult) {
        return findUserEntities(false, maxResults, firstResult);
    }

    private List<User> findUserEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(User.class));
            Query q = em.createQuery(cq);
            if (!all) {
                q.setMaxResults(maxResults);
                q.setFirstResult(firstResult);
            }
            return q.getResultList();
        } finally {
            em.close();
        }
    }

    public User findUser(int id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(User.class, id);
        } finally {
            em.close();
        }
    }

    public int getUserCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<User> rt = cq.from(User.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }

}
