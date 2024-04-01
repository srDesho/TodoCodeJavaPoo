package com.cristianml.loginpractice.logic;

import com.cristianml.loginpractice.persistence.PersistenceController;
import java.util.List;
import javax.swing.JComboBox;
import javax.swing.JTextField;

public class Controller {
    PersistenceController persisControl = new PersistenceController();

    public User validateDatas(String username, String pass) {
        User usr = null;
        // Get userList
        List<User> userList = persisControl.BringUserList();
        for (User user : userList) {
            if (user.getUsername().equals(username)) {
                if (user.getPass().equals(pass)) {
                    usr = user;
                    return user;
                } else {
                    usr = null;
                }
            } else {
                usr = null;
            }
        }
        return usr;
    }

    public List<User> bringUserList() {
        return persisControl.BringUserList();
    }

    public User bringUser(int id) {
        return persisControl.bringUser(id);
    }

    public List<Role> bringRoleList() {
        return persisControl.bringRoleList();
    }

    public void createUser(String username, String pass, String role) {
        User usr = new User();
        // Add the id manually
        int idUser = getLastId();
        usr.setId(idUser + 1);
        usr.setUsername(username);
        usr.setPass(pass);
        
        // Add role
        List<Role> roleList = persisControl.bringRoleList();
        if (roleList != null) {
            for (Role rol : roleList) {
                if (rol.getRoleName().equals(role)) {
                    usr.setUnRole(rol);
                }
            }
        }
        
        persisControl.createUser(usr);
    }

    private int getLastId() {
        List<User> userList = persisControl.BringUserList();
        return userList.get(userList.size() - 1).getId();
    }    

    public void editUser(User user, String username, String pass, String role) {
        user.setUsername(username);
        user.setPass(pass);
        
        Role rol = bringRole(role);
        if (rol != null) {
            user.setUnRole(rol);
        }
        persisControl.editUser(user);
    }

    private Role bringRole(String role) {
        List<Role> roleList = persisControl.bringRoleList();
        if (roleList != null) {
            for (Role role1 : roleList) {
                if ( role1.getRoleName().equals(role))
                    return role1;
            }
        }
        return null;
    }

    public void deleteUser(int idUser) {
        persisControl.deleteUser(idUser);
    }
}
