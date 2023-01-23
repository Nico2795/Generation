/* 2. Escriba una función tal que recibe un número entero positivo. Si es par, debe devolver su
antecesor y en caso contrario, su sucesor. */

public class AntecesorYSucesor {

    static Integer numero(int num1) {
        while(num1>0){
            if(num1 % 2 == 0){
                return num1-1;
            }
            else{return num1+1;
            }
        }
        return num1;

    }
    public static void main(String[] args) {
        System.out.println(numero(3));
    }
}