package com.genspringboot.project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.genspringboot.project.model.User;
import com.genspringboot.project.service.UserService;

@RestController
//Crossorigin le voy a dar permiso para que de caulqueir url pueda ingresar a mi controlador si es que yo tengo mi servicio andadno. Nos permite hacer peticiones desde cualquier parte, no solo desde nuestro servidor local.

@CrossOrigin("*")
public class UserController {
    
    private UserService userService; //llamamos al userservice para saber que tiodo esta bien

    //Con esto vemos que los permisos del sitio estén bnien
    public UserController(@Autowired UserService userService){
        this.userService = userService;
    }

    @GetMapping("/user/{id}")
    //Pathvariable si es cuando lo que le mando es atraves de una url
    public User getUser(@PathVariable Integer id){
        return userService.getUser(id);
    }

    @PostMapping("/user")
    //Aqui no le estamos mandando el comando a travex de una url, si no que a traves de un body, por lo que hay que escribirle, este body tiene un formato JSON que lo veremos más adelante.  
    public User newUser(@RequestBody User user){
        return userService.save(user);
    }

    @PutMapping ("/user")
    public User updatUser(@RequestBody User user){
        return userService.save(user);
    }

    @DeleteMapping("/deleteUser/{id}")
    public void deleteUser(@PathVariable Integer id){
        userService.delete(id);
    }
}
