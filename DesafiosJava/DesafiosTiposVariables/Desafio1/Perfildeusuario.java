import java.io.Console;

// Desafio 1:
// Cree una clase titulada "Perfil de usuario"
// crear funcion main
// Escriba el código para que la aplicación almacene el nombre, la edad, el género, la preferencia laboral, la nacionalidad y el tipo de sangre de los usuarios.
// Piense en los nombres de variables que desea asignar a las propiedades anteriores y las convenciones de nombres de variables que se deben seguir.
// Utilice la edad para calcular el año en que nació un usuario.
// Imprima los valores en la consola de un usuario.

//FORMA 1
// public class Perfildeusuario {
//     public static void main(String[] args) {
//         String nombre = "Nicolás";
//         int edad = 27;
//         int añoActual = 2022;
//         String genero = "Masculino";
//         String preferenciaLaboral = "Progamador y Dentista";
//         String nacionalidad = "Chilena";
//         String tipodeSangre = "B";
//         int añoNacimiento = añoActual - edad;
//         System.out.println("Tu nombre es : " + nombre);
//         System.out.println("Tienes: " + edad + " años");
//         System.out.println("Tu género es : " + genero);
//         System.out.println("Tu preferencia laboral es: " + preferenciaLaboral);
//         System.out.println("Tu nacionalidad es: " + nacionalidad);
//         System.out.println("Tu tipo de sangre es :" + tipodeSangre);
//         System.out.println("Naciste en el año " + añoNacimiento);
//     }; 
// }

// FORMA 2
public class Perfildeusuario {
    public static void main (String[] args) {
        Console console = System.console();
        String nombre = console.readLine("Inserte nombre: ");
        String edad = console.readLine("Ingrese su edad: ");
        int edad1= Integer.parseInt(edad);
        String añoactual = console.readLine("Ingrese el año actual: ");
        int año = Integer.parseInt(añoactual);
        int añoNacimiento = año - edad1; 
        String genero = console.readLine("Ingresa tu genero: ");
        String preferenciaLaboral = console.readLine("Introduce tu preferencia laboral ");
        String nacionalidad = console.readLine("Introduce tu nacionalidad: ");
        String tiposangre = console.readLine("Introduce tu tipo de sangre: ");
        System.out.println("Tu nombre es: "+ nombre);
        System.out.println("Tienes: " + edad + " años");
        System.out.println("Naciste en el año: "+ añoNacimiento);
        System.out.println("Tu género es: " + genero);
        System.out.println("Tu preferencia laboral es: " + preferenciaLaboral);
        System.out.println("Tu nacionalidad es: "+ nacionalidad);
        System.out.println("Tu tipo de sangre es: " + tiposangre);
    }
}