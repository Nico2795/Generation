import java.io.Console;

public class descuentosPeliculas {
    public static void main (String [] args) {
        Console console = System.console();
        System.out.println("Ingresa tu edad para ver si tienes algún descuento: ");
        int edad = Integer.parseInt(console.readLine());
        int billete = 7;

        if(edad < 5) {
            System.out.println("Tu descuento es de 60% y el total es: " + billete * 0.4);
        }
        else if (edad > 60){
            System.out.println("Tu descuento es de 55% y el total es: " + billete * 0.45);
        }
        else{
            int boleto = Integer.parseInt(console.readLine("Ingrese la cantidad de boletos que desea"));
            if(boleto >=2){
                System.out.println("Tu descuento es de " + billete *0.3);
            }
        }
        }
        }
