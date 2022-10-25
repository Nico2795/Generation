// /* Cree una clase que se llame conversorPeso
// cree un menú en donde se le pida al usuario ingresar:
// 1 si desea covertir el peso en marte
// 2 si desea convertir el peso en luna.
// Luego pida al usuario el peso que desea convertir.
// realice la busqueda de cuantos kilos en tierra son en marte y en 
// ejemplo:

// Bienvenido.
// Ingerse 1 si desea covertir el peso en marte.
// Ingrese 2 si desea convertir el peso en luna.
// 2
// Ingrese el peso que desea convertir
// 50
// El peso ingresado en la luna sería de: 8.27

// Calcular peso en marte: (pesoTierra / 9.81) * 3.711
//Calcular peso en luna( pesoTierra / 9.81) * 1.622
import java.io.Console;

public class conversorPeso{
    public static void main (String [] arg ){
        Console console = System.console();
        System.out.println("Bienvenido/a");
        System.out.println("Ingresa 1 para convertir el peso en marte");
        System.out.println("Ingresa 2 para convertir el peso en luna");
        int opcion = Integer.parseInt(console.readLine());
        

        if(opcion == 1){
            double peso = Double.parseDouble(console.readLine("Ingresa tu peso en kg: "));
            double pesomarte = (peso / 9.81) * 3.711;
            System.out.println("Tu peso en marte es " + pesomarte);
        }
        else if (opcion ==2){
            double peso = Double.parseDouble(console.readLine("Ingresa tu peso en kg: "));
            double pesoluna = (peso / 9.81) * 1.622;
            System.out.println("Tu peso en la luna es " + pesoluna);
        }
        else{
            System.out.println("No ingresaste una opcion valida, elige entre la opción 1 o 2");
        }
    }
}