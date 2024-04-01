package com.cristianml.loginpractice.logic;

import com.cristianml.loginpractice.persistence.PersistenceController;
import java.util.List;

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

    
    
}
