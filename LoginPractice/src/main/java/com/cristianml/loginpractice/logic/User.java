package com.cristianml.loginpractice.logic;

import javax.persistence.*;

@Entity
public class User {
    @Id
    private int idUser;
    @Basic
    private String user;
    private String pass;
    @ManyToOne
    @JoinColumn(name = "idRole")
    private Role unRole;

    public User() {
    }

    public User(int idUser, String user, String pass, Role unRole) {
        this.idUser = idUser;
        this.user = user;
        this.pass = pass;
        this.unRole = unRole;
    }

    public int getIdUser() {
        return idUser;
    }

    public void setIdUser(int idUser) {
        this.idUser = idUser;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
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
