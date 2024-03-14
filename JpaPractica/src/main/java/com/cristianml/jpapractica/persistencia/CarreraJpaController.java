
package com.cristianml.jpapractica.persistencia;

import com.cristianml.jpapractica.logica.Carrera;
import java.io.Serializable;
import javax.persistence.Query;
import javax.persistence.EntityNotFoundException;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import com.cristianml.jpapractica.logica.Materia;
import com.cristianml.jpapractica.persistencia.exceptions.NonexistentEntityException;
import java.util.LinkedList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


public class CarreraJpaController implements Serializable {

    public CarreraJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    
    public CarreraJpaController() {
        emf = Persistence.createEntityManagerFactory("practicaJPAPU");
    }
    
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Carrera carrera) {
        if (carrera.getListaMaterias() == null) {
            carrera.setListaMaterias(new LinkedList<Materia>());
        }
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            LinkedList<Materia> attachedListaMaterias = new LinkedList<>();
            for (Materia listaMateriasMateriaToAttach : carrera.getListaMaterias()) {
                listaMateriasMateriaToAttach = em.getReference(listaMateriasMateriaToAttach.getClass(), listaMateriasMateriaToAttach.getId());
                attachedListaMaterias.add(listaMateriasMateriaToAttach);
            }
            carrera.setListaMaterias(attachedListaMaterias);
            em.persist(carrera);
            for (Materia listaMateriasMateria : carrera.getListaMaterias()) {
                Carrera oldCarreOfListaMateriasMateria = listaMateriasMateria.getCarre();
                listaMateriasMateria.setCarre(carrera);
                listaMateriasMateria = em.merge(listaMateriasMateria);
                if (oldCarreOfListaMateriasMateria != null) {
                    oldCarreOfListaMateriasMateria.getListaMaterias().remove(listaMateriasMateria);
                    oldCarreOfListaMateriasMateria = em.merge(oldCarreOfListaMateriasMateria);
                }
            }
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Carrera carrera) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Carrera persistentCarrera = em.find(Carrera.class, carrera.getId());
            LinkedList<Materia> listaMateriasOld = persistentCarrera.getListaMaterias();
            LinkedList<Materia> listaMateriasNew = carrera.getListaMaterias();
            LinkedList<Materia> attachedListaMateriasNew = new LinkedList<>();
            for (Materia listaMateriasNewMateriaToAttach : listaMateriasNew) {
                listaMateriasNewMateriaToAttach = em.getReference(listaMateriasNewMateriaToAttach.getClass(), listaMateriasNewMateriaToAttach.getId());
                attachedListaMateriasNew.add(listaMateriasNewMateriaToAttach);
            }
            listaMateriasNew = attachedListaMateriasNew;
            carrera.setListaMaterias(listaMateriasNew);
            carrera = em.merge(carrera);
            for (Materia listaMateriasOldMateria : listaMateriasOld) {
                if (!listaMateriasNew.contains(listaMateriasOldMateria)) {
                    listaMateriasOldMateria.setCarre(null);
                    listaMateriasOldMateria = em.merge(listaMateriasOldMateria);
                }
            }
            for (Materia listaMateriasNewMateria : listaMateriasNew) {
                if (!listaMateriasOld.contains(listaMateriasNewMateria)) {
                    Carrera oldCarreOfListaMateriasNewMateria = listaMateriasNewMateria.getCarre();
                    listaMateriasNewMateria.setCarre(carrera);
                    listaMateriasNewMateria = em.merge(listaMateriasNewMateria);
                    if (oldCarreOfListaMateriasNewMateria != null && !oldCarreOfListaMateriasNewMateria.equals(carrera)) {
                        oldCarreOfListaMateriasNewMateria.getListaMaterias().remove(listaMateriasNewMateria);
                        oldCarreOfListaMateriasNewMateria = em.merge(oldCarreOfListaMateriasNewMateria);
                    }
                }
            }
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                int id = carrera.getId();
                if (findCarrera(id) == null) {
                    throw new NonexistentEntityException("The carrera with id " + id + " no longer exists.");
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
            Carrera carrera;
            try {
                carrera = em.getReference(Carrera.class, id);
                carrera.getId();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The carrera with id " + id + " no longer exists.", enfe);
            }
            LinkedList<Materia> listaMaterias = carrera.getListaMaterias();
            for (Materia listaMateriasMateria : listaMaterias) {
                listaMateriasMateria.setCarre(null);
                listaMateriasMateria = em.merge(listaMateriasMateria);
            }
            em.remove(carrera);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Carrera> findCarreraEntities() {
        return findCarreraEntities(true, -1, -1);
    }

    public List<Carrera> findCarreraEntities(int maxResults, int firstResult) {
        return findCarreraEntities(false, maxResults, firstResult);
    }

    private List<Carrera> findCarreraEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Carrera.class));
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

    public Carrera findCarrera(int id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Carrera.class, id);
        } finally {
            em.close();
        }
    }

    public int getCarreraCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Carrera> rt = cq.from(Carrera.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }

}
