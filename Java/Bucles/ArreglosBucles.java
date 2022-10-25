import java.io.Console;

public class ArreglosBucles {
    // public static void main(String[] args) {
        /*bucles Javascript
         * for,for each, while y do while
         * for en JavasCript --> for (var i=0; i<2; i++){}
         * for en JAVA --> for (int i = 0 ; i < 2 ; i++) {}
         * for each en JS --> nomArreglo.forEach(element)(siendo element cada objeto del arreglo)
         * for each en JAVA --> for(String nomArreglo: element) {} (recorro cada elemento del string)
         * 
         * while en JS --> while(condicion) {} (verificar que en algun momento se cumpla la condicion)
         * while en JAVA --> while(condicion){}(igual que en JS)
         * do while en JS -> do{se hace la operacion} while(condicion);
         * do while JAVA (se ocupa en operaciones donde debe entrar si o si al menos una vez)
         */
            
    public static void main(String[] args) {
        Console console = System.console();
        System.out.println("Bienvenido/a");
        int contador = 0;
        int repeticiones = Integer.parseInt(console.readLine("Ingrese cuantas comisiones va a calcular: "));
        while(contador != repeticiones){
            int venta = Integer.parseInt(console.readLine("Ingresa su cifra de ventas "));
            if (venta>1000){
                System.out.println("Su comicion es de : " + (venta*0.3));
                }
            else if (venta>=5000 && venta <= 9999){
                System.out.println("Su comision es de : " + (venta*0.2) + "Correspondiente al 20%");
                }
            else if(venta>=1001 && venta <= 4999){
                    System.out.println("Su comision es de : " + (venta * 0.1) + "correspondiente al 10%");
                }
                else{
                    System.out.println("A usted no le corresponde comision");
                }
                System.out.println(contador);
                contador ++;
                System.out.println(contador);
            }

        }
    }