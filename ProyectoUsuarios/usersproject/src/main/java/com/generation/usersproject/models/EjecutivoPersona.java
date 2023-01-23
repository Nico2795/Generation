package com.generation.usersproject.models;

public class EjecutivoPersona extends Banco{

    public EjecutivoPersona() {
        super();
    }

    public EjecutivoPersona(String nombre, String contraseña, int id_usuario, String correo, int telefono,
            Boolean login_status) {
        super(nombre, contraseña, id_usuario, correo, telefono, login_status);
    }

    public void usoInternacional(){
        System.out.println("Habilitar tarjetas para uso internacional");
    }

    public void seguroPersonal(){
        System.out.println("Ofrecer seguros personales");
    }

    @Override
    public String toString() {
        return super.toString()+"EjecutivoPersona []";
    }

    
    

}
