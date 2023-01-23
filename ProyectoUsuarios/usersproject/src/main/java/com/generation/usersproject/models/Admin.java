package com.generation.usersproject.models;

public class Admin extends Banco {

    public Admin() {
    }

    public Admin(String nombre, String contraseña, int id_usuario, String correo, int telefono, Boolean login_status) {
        super(nombre, contraseña, id_usuario, correo, telefono, login_status);
    }

    public void obtenerPrivilegios(){
        System.out.println("Obtiene privilegios de los usuarios");
    }

    @Override
    public String toString() {
        return super.toString() +"Admin []";
    }
    
    
}
