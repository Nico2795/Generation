import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class cadaArreglo{
    public static void main(String[] args) {
        ArrayList <Integer> miArray = new ArrayList <Integer>(Arrays.asList(0,28,30,10,4));
            for (Integer integer : miArray){
                System.out.println(integer);
            }
        }
    }
