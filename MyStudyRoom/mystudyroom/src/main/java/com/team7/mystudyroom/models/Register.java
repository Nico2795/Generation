package com.team7.mystudyroom.models;


import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;


@Entity
public class Register {
    @Id
    @GeneratedValue
    private Integer register_id;

    private String name;
    private String userName;
    private String email;
    private String password;


    public Register() {
    }

    @OneToMany(mappedBy = "register", cascade = CascadeType.ALL, fetch= FetchType.EAGER)
    private User user;


    public Register(Integer register_id, String name, String userName, String email, String password) {
        this.register_id = register_id;
        this.name = name;
        this.userName = userName;
        this.email = email;
        this.password = password;
    }


    public Integer getRegister_id() {
        return register_id;
    }


    public void setRegister_id(Integer register_id) {
        this.register_id = register_id;
    }


    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }


    public String getUserName() {
        return userName;
    }


    public void setUserName(String userName) {
        this.userName = userName;
    }


    public String getEmail() {
        return email;
    }


    public void setEmail(String email) {
        this.email = email;
    }


    public String getPassword() {
        return password;
    }


    public void setPassword(String password) {
        this.password = password;
    }

    

    

    
}
