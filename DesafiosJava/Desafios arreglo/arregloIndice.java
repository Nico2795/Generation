import java.io.Console;
import java.lang.reflect.Array;
import java.util.ArrayList;
//Necesito crear una funcion que me pida el arraylist y un numero, ese numero debe ser el indice que se va a recorrer. 
//recorrer el arraylist, si dentro del arraylist recibo un numero que se repita que me lomuestre en pantalla
//Esto se debe hacer con funciones recursivas, investigar

import javax.sound.sampled.SourceDataLine;

public class arregloIndice {
    static ArrayList arreglos ( ArrayList<Integer> numeros, int num){
        Console console = System.console();
        int cantidad = Integer.parseInt(console.readLine("Ingrese la cantidad de listas"));


        while(cantidad != 0 ) {
            ArrayList<Integer> numeroslista = new ArrayList<>();
            ArrayList<Integer> indices = new ArrayList<>();
            for(int i = 0; i<=3; i++){
                int numeroslita1 = Integer.parseInt(console.readLine("Ingresa la lista de numeros"));
                numeroslista.add(numeroslita1);
            }
            for(Integer numerosList: numeroslista){
                numeroslista.indexOf(num);
                indices.add(numerosList);
                return indices;
            }
            return numeroslista;
            }
            
            cantidad--;

            return numeros;
        }
    


    public static void main(String[] args) {
        System.out.println(arreglos(null, 5));
    }
}



