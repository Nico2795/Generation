package com.security.util;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class Passgenerator {
    //Encargado de generar la encriptacion del password.

    //Clase void main que tiene que estar corriendo en conjunto al secutiry aplication y nos va a crear las encriptaciones, por eso es un main, por eso va a estar siempre corriendo
    public static void main(String ...args) {
        BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder(4);
        //El String que mandamos al metodo encode es el password que queremos encriptar.
	System.out.println(bCryptPasswordEncoder.encode("1234"));
    }
}
