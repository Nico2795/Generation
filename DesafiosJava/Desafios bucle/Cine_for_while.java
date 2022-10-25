import java.io.Console;
/*
A movie cinema does price discounting depending on a customer's age.
The app prompts a user to enter their age on the IntelliJ console after which it checks whether the user meets the discount conditions.
Age range	Ticket Price
Normal ticket	7 Euros
Below 5	60% Discount
Over 60	55% Discount
Write the app so that the conditions above are met and the correct ticket price is returned.
*/

public class Cine_for_while {
    public static void main(String[] args) {
        Console console = System.console();
        int precioTicket = 7;
        int descuento;
        int repeticiones = Integer.parseInt(console.readLine("Ingrese el numero de personas que comprará entradas"));
        
        while(repeticiones != 0){
            System.out.println("Ingrese la edad del cliente ");
            int edad = Integer.parseInt(console.readLine());
            if(edad >= 5 && edad <= 60) {
                System.out.println("El rango de edad corresponde a un ticket normal sin descuento. ");
                System.out.println("Por lo tanto el precio total a pagar por el ticket es de " +precioTicket);
            }
            else if (edad < 5 && edad >= 0) {
                descuento = 60;
                int nuevoPrecioTicket = precioTicket - ((descuento*precioTicket)/100);
                System.out.println("El rango de edad corresponde a un ticket con 60% de descuento. ");
                System.out.println("Por lo tanto el precio total a pagar por el ticket es de " +nuevoPrecioTicket);
            }
            else if (edad > 60 && edad <= 100) {
                descuento = 55;
                int nuevoPrecioTicket = precioTicket - ((descuento*precioTicket)/100);
                System.out.println("El rango de edad corresponde a un ticket con 55% de descuento. ");
                System.out.println("Por lo tanto el precio total a pagar por el ticket es de " +nuevoPrecioTicket);
            }
            else {
                System.out.println("Edad fuera de rango");
            }
            repeticiones--;
        }
    }
}