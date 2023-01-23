import java.io.Console;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;


public class ejercicio {
    public static void main(String[] args) {
        Map <String,ArrayList> libroClases = new HashMap<String,ArrayList>(); 
        Console console = System.console();
        System.out.println("******Bienvenido******");
        int cantidad = Integer.parseInt(console.readLine("Ingrese la cantidad de alumnos"));

        while(cantidad != 0){
            String nombre = console.readLine("Ingrese el nombre del alumno/a: ");
            ArrayList <Float> notas = new ArrayList<Float>(); 
            for(int i = 1; i<=3; i++){
                Float nota = Float.parseFloat(console.readLine("Ingrese nota " + i + ":"));
                if(nota < 0 || nota > 7){
                    System.out.println("Ingresa un numero dentro de los valores, vuelve a intentarlo");
                    
                }

                notas.add(nota);
            }
            libroClases.put(nombre, notas);
            cantidad--;
        }
        System.out.println(libroClases);
        for(String i: libroClases.keySet()){
            float suma = 0.0f;  
            for(Object x: libroClases.get(i)){
                suma = (Float) x + suma;
            }
            System.out.printf("\nEl promedio de: "+i+" fue de: %.1f ",suma/3);; //promedio debe salir con un decimal, no se pueden ingresar notas menores a 0 y superiores a 7, si esto ocurre hay que volver a pedir esa nota. 
        }
    }

}