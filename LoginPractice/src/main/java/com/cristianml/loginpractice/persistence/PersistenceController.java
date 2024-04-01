package com.cristianml.loginpractice.persistence;

import com.cristianml.loginpractice.logic.User;
import java.util.List;

public class PersistenceController {
    UserJpaController userJpa = new UserJpaController();
    RoleJpaController roleJpa = new RoleJpaController();

    public User bringUser() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public List<User> BringUserList() {
        return userJpa.findUserEntities();
    }
    
}
