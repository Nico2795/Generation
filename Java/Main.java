import java.io.Console;

public class Main {
    public static void main (String [] arg) {
        //para mostrar en consola en Javascript --> console.log()
        // para mostrar en consola en Java
        System.out.print("este es un mensaje de la consola");  
        //Esto imprime con salto de linea
        System.out.println("hola");        
        //Para pedirle informacion al usuario se ocupa 
        Console console = System.console();
        String nombre = console.readLine("inserte nombre: ");
        System.out.println("este es el nombre " + nombre);    
        // Variable es un espacio en la memoria donde yo guardo un objeto, boolean, number, string, objects
        //Tipos de variables en Java -->
        String num = console.readLine("inserte numero 1: ");
        int nuevoNum = Integer.parseInt(num);
        String num2 = console.readLine("inserte numero 2:");
        int nuevoNum2 = Integer.parseInt(num2);
        int suma = nuevoNum + nuevoNum2; 
        System.out.println("El numero es : " + suma);

        //int suma = Integer.parseInt(num) + Integer.parseInt(num2);
//System.out.println("El numero es : " + suma;
    }
}
