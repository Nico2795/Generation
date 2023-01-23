/*Programa para ingresar alumnos:
-Cantidad de alumnos a ingresar.
-Por cada alumno solicitar e ingresar en hashmap: Nombre Alumno, 3 notas (guardar en arraylist). */

import java.io.Console;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class PracticaAlumnos {
    public static void main(String[] args) {
        Map <String, ArrayList> libroClases = new HashMap<String,ArrayList>();
        Console console = System.console();
        int cantidad = Integer.parseInt(console.readLine("Ingresa cuantos alumnos son"));
        while(cantidad!= 0 ){
            ArrayList <Float> notas = new ArrayList<Float>(); 
            String nombre= console.readLine("Ingresa tu nombre: ");
            for(int i = 1; i<=3 ; i++) {
                Float nota = Float.parseFloat(console.readLine("Ingresa notas" + i+ ": "));
                if(nota < 0 || nota > 7){
                System.out.println("Estas ingresando un numero fuera del rango");
                i--;
                }
                else {notas.add(nota);
                }
            }

            libroClases.put(nombre, notas);
            cantidad--;
        }

System.out.println(libroClases);


    }
}