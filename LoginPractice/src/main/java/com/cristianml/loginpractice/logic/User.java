package com.cristianml.loginpractice.logic;

import java.io.Serializable;
import javax.persistence.*;

@Entity
public class User implements Serializable {
    @Id
    private int id;
    @Basic
    private String username;
    private String pass;
    @ManyToOne
    @JoinColumn(name = "fk_role")
    private Role unRole;

    public User() {
    }

    public User(int id, String username, String pass, Role unRole) {
        this.id = id;
        this.username = username;
        this.pass = pass;
        this.unRole = unRole;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String user) {
        this.username = user;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public Role getUnRole() {
        return unRole;
    }

    public void setUnRole(Role unRole) {
        this.unRole = unRole;
    }
    
    
}
