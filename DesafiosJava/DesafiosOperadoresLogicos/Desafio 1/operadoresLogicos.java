/*Escriba un programa donde el usuario ingrese una calificación de un estudiante y el programa devuelva una nota basada en las siguientes condiciones:
Suspendió si obtuvo una nota igual o inferior a 3.
Insuficiente si tuvo mayor a 3 pero menos que 5 (inclusive)
Bueno si obtuvo una nota mayor a 5 pero menor a 8 (inclusive)
Excelente si consiguió un 10
Debe avisar si se ingresa un número fuera del rango (0 a 10) */

import java.io.Console;

public class operadoresLogicos {
    public static void main ( String [] args) {
        Console console = System.console();
        String nota = console.readLine("Ingresa tu nota aqui: ");
        int notaint= Integer.parseInt(nota);
        
        if(notaint >= 0 && notaint <=3){
            System.out.println("Has suspendido");
        }
        else if(notaint > 3 && notaint <5){
            System.out.println("Insuficiente");
        }
        else if(notaint >= 5 && notaint <=8) {
            System.out.println("Bueno");
        }
        else if( notaint == 9 || notaint == 10) { 
            System.out.println("Excelente");
        }
        else{
            System.out.println("Ingresa nota dentro del rango");
        }
    }
}