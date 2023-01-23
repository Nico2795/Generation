package com.generation.firstproyect.models;

import java.io.Console;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/*vamos a pedir que al usuario cree objetos:
por consola vamos a preguntar cuantos objetos quiere crear.
le vamos a pedir que ingrese todos los datos de el objeto
le vamos a mostrar todos los objetos que creó (por ende cada objeto debe guardarse en una lista(array))
 */

public class Usuario {
    
    public Usuario(){
    }
    
    public static void main(String[] args) {
        Map <String, ArrayList> miArray = new HashMap<String, ArrayList>();
        Console console = System.console();
        System.out.println("***Bienvenido/a vas a crear un objeto persona***");
        int cantidad = Integer.parseInt(console.readLine("Ingrese cantidad de objetos persona: "));
        while(cantidad !=0 && cantidad <=3){
            String parametro1 = console.readLine("Ingrese el nombre de la persona");
            ArrayList <Integer> edad = new ArrayList<Integer>();
            int parametro2 = Integer.parseInt(console.readLine("Ingresa la edad")) ;
            ArrayList <Float> estatura = new ArrayList<Float>();
            int parametro3 = Integer.parseInt(console.readLine("Ingrese su año de nacimiento"));
            ArrayList<Integer> doslistas = new ArrayList<Integer>();
            doslistas.add(parametro2);
            doslistas.add(parametro3);
            miArray.put(parametro1, doslistas);
            cantidad --;

        }
        System.out.println(miArray);
    }
}
