package com.generation.usersproject.models;

public class Cajero extends Banco{

    public Cajero() {
        super();
    }

    public Cajero(String nombre, String contraseña, int id_usuario, String correo, int telefono, Boolean login_status) {
        super(nombre, contraseña, id_usuario, correo, telefono, login_status);
    }

    public void depositar() {
        System.out.println("Listo ya depositaste tu dinero");
    }
    public void sacarDinero() {
        System.out.println("Has sacado tu dinero");
    }
    public void abrirCuenta() {
        System.out.println("Has abierto tu cuenta");
    }
    public void cerrarCuenta() {
        System.out.println("Has cerrado tu cuenta");
    }
    public void pedirPrestamos() {
        System.out.println("Has pedido un prestamo");
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
        return super.toString() + "Cajero []";
    }
    
    
    
}
