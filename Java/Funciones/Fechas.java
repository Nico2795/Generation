import java.io.Console;
import java.util.ArrayList;
import java.util.Collections;

/* 4. Escriba una función que reciba una fecha en formato DDMMAAAA y la devuelva en formato
AAAAMMDD. Use su función en un programa que reciba por teclado dos fechas (en formato
DDMMAAAA) e imprima en pantalla la mayor. */

public class Fechas {
    
    static ArrayList fechitas(){
        Console console = System.console();
        ArrayList <Integer> numeros = new ArrayList<Integer>(); 
        Integer dia = Integer.parseInt(console.readLine("Ingresa el día en formato DD"));
        Integer mes = Integer.parseInt(console.readLine("Ingresa el mes en formato MM"));
        Integer año = Integer.parseInt(console.readLine("Ingresa el año en formato AAAA"));
        numeros.add(año);
        numeros.add(mes);
        numeros.add(dia);
        return numeros;


    }

    public static void main(String[] args) {
        //Sumar los elementos dentro del ArrayList, para poder comparar el total, si el total de fecha 1 es mayor a fecha 2, que solo retorne la fecha 1 en formato AAAA,MM, DD
        //Encontrar el numero mayor dentro de un Arraylist, si esa lista contiene el numero mayor de ambas listas, que me devuelva la otra. 
/*         ArrayList fecha1 = fechitas();
        ArrayList fecha2 = fechitas();
        Object total = 0 ; */
        ArrayList pirmeraFecha = fechitas();
        System.out.println("----------------------------");
        ArrayList segudnaFecha = fechitas();

        int fecha1 = (int) Collections.max(pirmeraFecha);
        int fecha2 = (int) Collections.max(segudnaFecha);
        System.out.println("----------------------------");
        if(fecha1 > fecha2){
            System.out.println("La fecha mayor o de más antiguedad es: "+ segudnaFecha);
        }
        else{
            System.out.println("La fecha mayor o de más antiguedad es: "+ pirmeraFecha);
        }
        }
        }


