package com.genspringboot.project.service;

import java.util.Optional;


import org.springframework.stereotype.Service;

import com.genspringboot.project.model.User;
import com.genspringboot.project.repository.UserRepository;

//Impl = implementado
@Service
public class UserServiceImpl implements UserService{
    
    private UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository){
        this.userRepository = userRepository;
    }

    
    @Override
    public User getUser(Integer id){
        //Simil al arraylist pero tiene caracteristicas que nos permiten tener o no tener datos, la diferencia es que el optional nos permite ahcer cosas de manera mas directa si es que tiene datos, le podemos dar la funcion if o or else para ver si es que hay datos, el or else nos puede dar un mensaje de si es que está o no vacio o lleno el arraylist. Sería como una especia de arraylist más completo. Es un tipo de variable que ya existe y que no tengo que crearlo. 
        //select * from user where id = id;
        Optional <User> users = userRepository.findById(id);
        //guardame en optional el usuario, y si esta vacio me retorna nullo, si encuentra algo me da el usuario
        return users.orElse(null); 
    }

    @Override
    public User save(User user){
        //Insert into user(columnas)(values)
        //Podria ser sin retorno pero de esta manera nos indica el usurio que ingresó
        return userRepository.save(user);
    }
    @Override
    public void delete(Integer id){
        //Es lo mismo que hacer un delete from user where id = id;
        userRepository.deleteById(id);
    }
    }

