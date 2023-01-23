package com.generation.usersproject.models;

import java.io.Console;

import org.springframework.boot.context.properties.bind.handler.IgnoreTopLevelConverterNotFoundBindHandler;
import org.springframework.http.client.support.InterceptingHttpAccessor;

public class Cliente extends Banco {
    String direccion;
    int numero_cuenta;
    String password;
    String userName;
    
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = "olakeace";
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = "nico";
    }

    public Cliente() {
        super();
    }

    public Cliente(String nombre, String contraseña, int id_usuario, String correo, int telefono, Boolean login_status,
            String direccion, int numero_cuenta) {
        super(nombre, contraseña, id_usuario, correo, telefono, login_status);
        this.direccion = direccion;
        this.numero_cuenta = numero_cuenta;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getNumero_cuenta() {
        return numero_cuenta;
    }

    public void setNumero_cuenta(int numero_cuenta) {
        this.numero_cuenta = numero_cuenta;
    }


    public void solicitudes() {
        System.out.println("Indique su solicitud");
    }
    public void consultas() {
        System.out.println("Indique su consulta");
    }

    public Boolean login(){
        try{
        if(this.login_status){
            return true;
        }
        else {
            return false;
        }
    } catch(Exception e) {
        return false;
    }
}
public String nombre(){
    Console console = System.console();
    String nombreUsuario = console.readLine("Ingresa tu usuario");
    return nombre;
}

    public String Usuario(String usuario1, String contraseña1){
    if(usuario1 == "Marco" && contraseña1 == "olakeace"){
        return "Has iniciado sesion";
    }
    else{
        return "No puedes iniciar sesion";
    }
    }

    
    

    @Override
    public String toString() {
        return super.toString() + "Cliente [direccion=" + direccion + ", numero_cuenta=" + numero_cuenta + "]";
    }

    

    
}
