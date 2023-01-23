package com.generation.usersproject.models;

public class Banco {
    String nombre;
    String contraseña;
    int id_usuario;
    String correo;
    int telefono;
    Boolean login_status;


    public Banco() {
    }


    public Banco(String nombre, String contraseña, int id_usuario, String correo, int telefono, Boolean login_status) {
        this.nombre = nombre;
        this.contraseña = contraseña;
        this.id_usuario = id_usuario;
        this.correo = correo;
        this.telefono = telefono;
        this.login_status = login_status;
    }


    public String getNombre() {
        return nombre;
    }


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public String getContraseña() {
        return contraseña;
    }


    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }


    public int getId_usuario() {
        return id_usuario;
    }


    public void setId_usuario(int id_usuario) {
        this.id_usuario = id_usuario;
    }


    public String getCorreo() {
        return correo;
    }


    public void setCorreo(String correo) {
        this.correo = correo;
    }


    public int getTelefono() {
        return telefono;
    }


    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }


    public Boolean getLogin_status() {
        return login_status;
    }


    public void setLogin_status(Boolean login_status) {
        this.login_status = login_status;
    }


    @Override
    public String toString() {
        return "Banco [nombre=" + nombre + ", contraseña=" + contraseña + ", id_usuario=" + id_usuario + ", correo="
                + correo + ", telefono=" + telefono + ", login_status=" + login_status + "]";
    }

    
}
