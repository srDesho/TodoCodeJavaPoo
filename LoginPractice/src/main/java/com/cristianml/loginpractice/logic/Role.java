package com.cristianml.loginpractice.logic;

import java.io.Serializable;
import java.util.List;
import javax.persistence.*;

@Entity
public class Role implements Serializable {
    @Id
    private int idRole;
    @Basic
    private String roleName;
    private String description;
    @OneToMany(mappedBy = "unRol")
    private List<User> userList;

    public Role() {
    }

    public Role(int idRole, String roleName, String description, List<User> userList) {
        this.idRole = idRole;
        this.roleName = roleName;
        this.description = description;
        this.userList = userList;
    }

    public int getIdRole() {
        return idRole;
    }

    public void setIdRole(int idRole) {
        this.idRole = idRole;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<User> getUserList() {
        return userList;
    }

    public void setUserList(List<User> userList) {
        this.userList = userList;
    }
    
    
    
}
