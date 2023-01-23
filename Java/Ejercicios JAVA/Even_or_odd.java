public class Even_or_odd {
    public static String IgualesoNo(int number){
        if(number % 2== 0){
            return "Iguales";
        }
        else{
            return"Impares";
        }
    }
    public static void main(String[] args) {
        System.out.println(IgualesoNo(5));
    }
}
