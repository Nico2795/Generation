package com.team7.mystudyroom.models;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity(name= "Admin")
public class Admin {
    @Id
    @GeneratedValue
    private Integer admin_id;

    private String nombre;
    private String email;
    private String password;

    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "user_type_id")
    private UserType userType;

    public Admin() {
    }


    public Admin(Integer admin_id, String nombre, String email, String password) {
        this.admin_id = admin_id;
        this.nombre = nombre;
        this.email = email;
        this.password = password;
    }


    public Integer getAdmin_id() {
        return admin_id;
    }


    public void setAdmin_id(Integer admin_id) {
        this.admin_id = admin_id;
    }


    public String getNombre() {
        return nombre;
    }


    public void setNombre(String nombre) {
        this.nombre = nombre;
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
