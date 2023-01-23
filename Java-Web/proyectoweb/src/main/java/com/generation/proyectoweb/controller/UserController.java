package com.generation.proyectoweb.controller;
    /*Estamos llamando a una instancia de nuestro userService, lo que nosotros estamos haciendo es crear el controlaador de ese modelo, es decir obtener el dato y recibirlo en la vista, voy a poder ver mi usuario creado en mi navegadod, y para poder llegar y crear necesito mi servicio, que son las funciones que ya cree para poder generar un usuario, el controller llama a los servicios para crear el usuario en la web */

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.generation.proyectoweb.model.User;
import com.generation.proyectoweb.service.UserService;

@RestController/*GET;POST:PUT:DELETE */
public class UserController {
    public UserService userService;
    public UserController(@Autowired UserService userService){
        this.userService = userService;

        userService.add(new User(1,"Nico","Bustamate"));
    }

    @GetMapping("/user") 
    public User getUser(){
        return userService.getUser(1);
    }

    @GetMapping("/AllUser")
    public List<User> getAllUser(){
        return userService.getAll();
    }

    //localhost:8080/FindUser/1
    @GetMapping("/FindUser/{id}")
    public User FindUser(@PathVariable("id")int id ){
        return userService.getUser(id);
    }

    @GetMapping("/addUser/{id}/{nombre}/{apellido}")
        public void addUser(@PathVariable("id")int id, @PathVariable("nombre") String nombre, @PathVariable("apellido")String apellido){
            userService.add(new User(id,nombre,apellido));
        }

    @GetMapping("/removeUser/{id}")
        public void removeUser(@PathVariable("id")int id){
            userService.remove((id));
        }
    @GetMapping ("/countUser")
    public int getSize(){
        return userService.size();
    }



    
    /*Aqui le digo que la funcion get user, me devuelva, me retorne mi servicio. el get user que yo cree, que me devuelvea el usuario en la posiscion 0, el GetMapping, me está diciendo que me muestre el usuario en la URL predeteminada con el slash user*/

    /*Estamos importando un usuario por defecto, ahroa nos queda decirle al buscador donde los vamos a buscar, ahora lo llamamos con el request mapping. Vamos a decirle a nuestro navegador, desde el java web, le decimos a nuestro navegador que a partir de una URL vamos a obtener todos los usuarios en nuestro servicio.*/
    /*El controlador se conecta a la web, el autowired lo que hace es sobreescribir el servicio dentro del programa para que no venga desde la pagina web, si no que directo desde el programa.  */

}
