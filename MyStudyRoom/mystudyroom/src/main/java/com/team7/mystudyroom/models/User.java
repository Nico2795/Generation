package com.team7.mystudyroom.models;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity(name="User")
public class User {
    @Id
    @GeneratedValue
    private Integer user_id;

    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "user_type_id")
    private UserType userType;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="register_id")
    private Register register;

    @OneToMany(mappedBy = "User", cascade = CascadeType.ALL, fetch= FetchType.EAGER)
    private Settings settings;

    //No olvidar: user_type_id & register_id
    //Recordar los constructores.

}
