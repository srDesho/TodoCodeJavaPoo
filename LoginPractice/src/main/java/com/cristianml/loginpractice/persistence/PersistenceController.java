package com.cristianml.loginpractice.persistence;

import com.cristianml.loginpractice.logic.Role;
import com.cristianml.loginpractice.logic.User;
import com.cristianml.loginpractice.persistence.exceptions.NonexistentEntityException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class PersistenceController {
    UserJpaController userJpa = new UserJpaController();
    RoleJpaController roleJpa = new RoleJpaController();

    public User bringUser(int id) {
        return userJpa.findUser(id);
    }

    public List<User> BringUserList() {
        return userJpa.findUserEntities();
    }

    public List<Role> bringRoleList() {
        return roleJpa.findRoleEntities();
    }

    public void createUser(User usr) {
        try {
            userJpa.create(usr);
        } catch (Exception ex) {
            Logger.getLogger(PersistenceController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void editUser(User usr) {
        try {
            userJpa.edit(usr);
        } catch (Exception ex) {
            Logger.getLogger(PersistenceController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void deleteUser(int idUser) {
        try {
            userJpa.destroy(idUser);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(PersistenceController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
