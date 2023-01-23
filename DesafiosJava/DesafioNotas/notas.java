import java.io.Console;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;


public class notas {
    public static void main(String[] args) {
        Console console = System.console();
        int alumnos = Integer.parseInt(console.readLine("Ingrese el numero de alumnos: "));
        ArrayList <Float> miArray = new ArrayList <Float>(Arrays.asList());
        ArrayList <String> miArrayNombre = new ArrayList <String>(Arrays.asList());
        Map<String, ArrayList> miHashMap = new HashMap <String, ArrayList>();

        for(String i : miArrayNombre) {
            miArray.add(nombre);

        }

    //     while(alumnos != 0) {
    //         System.out.println("Ingrese nombre del alumno ");
    //         String nombre = console.readLine();
    //         for (String i : miHashMap.keySet()){
    //             System.out.println("key: " + i + ", value: "+miHashMap.get(i));
    //             miHashMap.get(nombre);
    //             alumnos --;
    //             miArrayNombre.add(nombre);

    //         int notas = Integer.parseInt(console.readLine("Ingrese el numero de notas de "+ nombre+": "));

    //         while (notas!=0){
    //             System.out.println("Ingresa tus calificaciones");
    //             float calificaciones = Float.parseFloat(console.readLine());
    //             miArray.add(calificaciones);

    //             notas --;
    //         }

    //         miHashMap.put(nombre, miArray);
    //     }
    //     System.out.println(miArray);
    //     System.out.println(miArrayNombre);
    //     System.out.println(miHashMap);
    // }
}
}