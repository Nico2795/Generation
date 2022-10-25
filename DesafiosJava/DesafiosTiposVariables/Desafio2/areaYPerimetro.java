import java.io.Console;

// Desafio 2
// Cree un proyecto nombre libre pista Vamos a encontrar el área y el perímetro de un círculo.
// Escriba una aplicación Java que solicite al usuario que ingrese el diámetro de un círculo y calcule el área y el perímetro del círculo.
// Realice una operación de conversión ampliada (de entero a doble) al almacenar el resultado de las operaciones.
// Imprime los resultados de las dos operaciones en la consola.

public class areaYPerimetro {
    public static void main (String [] arg ){
        Console console= System.console();
        String diametro = console.readLine("Ingrese el diametro de un circulo: ");
        Integer.parseInt(diametro);
        double diametrodouble = Double.parseDouble(diametro);
        double perimetro = diametrodouble * 3.1415;
        double radio = diametrodouble / 2 ;
        double area = (radio*radio) * 3.1415;
        System.out.println("El perimetro es: " + perimetro);
        System.out.println("El radio del circulo es:" + radio);
        System.out.println("El area del circulo es: " + area);
    }
}

//Averiguar sobre la libreria MATH