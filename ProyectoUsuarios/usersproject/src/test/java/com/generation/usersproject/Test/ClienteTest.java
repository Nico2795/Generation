package com.generation.usersproject.Test;

import static org.junit.jupiter.api.Assertions.*;

import java.io.Console;

import javax.websocket.ClientEndpointConfig;

import org.junit.jupiter.api.Test;

import com.generation.usersproject.models.Cliente;

//al ser una clase de tipo test, solo yo debo tener acceso a esta. entonces se borra el public. 
class ClienteTest {
    @Test
    void TestLogin(){
        Cliente cliente = new Cliente();
        assertEquals(false, cliente.login());
        
    }
    @Test
    void testUsuario(){
        Cliente cliente = new Cliente();
        assertEquals( "Has iniciado sesion" , cliente.Usuario("Marco", "olakeace"));
    }
    @Test
    void TestUsaurio2(){
        Console console = System.console();
        Cliente cliente2Nombre = new Cliente();
        assertEquals("Has iniciado sesion", cliente2Nombre.Usuario(console.readLine("Ingresa tu nombre de usuario: "), console.readLine("ingresa tu contraseña")));
    }
}


//
