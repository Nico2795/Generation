package com.generation.usersproject.models;

public class EjecutivoEmpresa extends Banco {

    public EjecutivoEmpresa() {
        super();
    }

    public EjecutivoEmpresa(String nombre, String contraseña, int id_usuario, String correo, int telefono,
            Boolean login_status) {
        super(nombre, contraseña, id_usuario, correo, telefono, login_status);
    }

    public void seguroEmpresa(){
        System.out.println("Ofrecer tipos de seguro");
    }
    public void abrirCuentaEmpresa(){
        System.out.println("Ofrecer abrir cuenta de empresa");
    }
    

    @Override
    public String toString() {
        return super.toString()+ "EjecutivoEmpresa []";
    }

    
    
    
}
