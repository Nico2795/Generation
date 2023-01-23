package com.generation.proyectoweb.service;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;
import com.generation.proyectoweb.model.User;
@Service//Es un objeto de tipo servicio. Lo que nos permite es que podemos crear atributos y darle funcionalidades s la pagina web donde va a poder ingresar. Por seguridad la pagina no puede ingresar al modelo, desde el servicio yo puedo ingresar al modelo, puedo ir al usuario, etc. Pero desde el modelo no puedo ingresar a la página web. El modelo no puede ser visto desed la web, porque si estamos hablando de un banco por ejemplo que los datos del usuario estan en bruto, es por esto que la pagina web no puede entrar. 
public class UserServiceArrayList implements UserService {
    private List <User> userList = new ArrayList<>();
    public UserServiceArrayList(){
    }
    @Override//Le indica a JAVA que lo que viene aqui viene desde la interfaz
    public List<User> getAll(){
        return userList;
    }
    @Override
    public void add(User user){
        userList.add(user);
    }
    @Override
    public void remove(int user){
        userList.remove(user);
    }
    @Override
    public int size(){
        return userList.size();
    }
    @Override
    public User getUser(int position){
        return userList.get(position);
    }
}
