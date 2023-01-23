import java.io.Console;
import java.util.ArrayList;
import java.util.Collections;


public class dosArreglos {
    public static void main(String[] args) {
        Console console = System.console();
        ArrayList <Integer> numeros = new ArrayList<Integer>(); 
        ArrayList <Integer> numeros2 = new ArrayList<Integer>();
        
            for(int i = 1 ; i <5; i++){
                Integer numerosint = Integer.parseInt(console.readLine("Ingresa los numeros de la lista 1: "));
                numeros.add(numerosint);
            }
            for(int i = 1 ; i <5; i++){
                Integer numerosint2 = Integer.parseInt(console.readLine("Ingresa los numeros de la lista 2: "));
                numeros2.add(numerosint2);
            }
            numeros.addAll(numeros2);
            Collections.sort(numeros);
            System.out.println(numeros);
    }
}
