package com.generation.proyectoweb.service;

import java.util.List;

import com.generation.proyectoweb.model.User;

public interface UserService {
    List <User> getAll();
    /*Nos trae los datos */

    void add(User user);
    /*Agregamos */
    void remove(int user);
    /*Removemos */

    int size();
    /*Tenemos el tamaño */

    User getUser(int position);
    /* Me trae la posicion*/

    
}

