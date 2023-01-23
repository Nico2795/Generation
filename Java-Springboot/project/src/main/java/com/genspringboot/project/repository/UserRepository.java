package com.genspringboot.project.repository;

import org.springframework.data.repository.CrudRepository;

import com.genspringboot.project.model.User;

//Tambien debe ser una interfaz, y ademas debe extender de una libreria que nos permita traer el grut de manera interna
//Estos framework que trae springboot nos permite hacer esto de manera muy facil, aqui vamos a extender talñ como si feura uina herencia. Esto nos permite crear, editar, buscar y eliminar. 

public interface UserRepository extends CrudRepository<User,Integer>{
    
}
