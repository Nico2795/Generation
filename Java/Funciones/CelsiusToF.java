import java.io.Console;

/* 3. Escriba una función que, dada una temperatura en grados Celsius, la devuelva en grados
Fahrenheit. Use su función en un programa que lea una cantidad indeterminada de
temperaturas en Celsius (que termina cuando se ingresa el valor -999) e imprima en pantalla el
valor correspondiente en Fahrenheit. */

public class CelsiusToF {

    static float temperatura(Float grados){
        if(grados != -999){
            float fahrenheint = (grados * 1.8f) + 32;
            return fahrenheint;

        }
        return grados;
    }

    public static void main(String[] args) {
        Console console = System.console();
        System.out.println("***Bienvenido****");

        while(true){
            float grado = Float.parseFloat(console.readLine("Ingrese los grados en Celsius"));
            System.out.println("La temperatura en Fahrenheit es" + temperatura((grado)));
            if( grado == -999){
                System.out.println("Saliendo");
                break;
            }

            }
        }
    }
        
    
