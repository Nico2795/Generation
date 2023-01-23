public class funcionPromedio {
    static Integer Promedio(int num1 , int num2) {
        int promedionotas = (num1 + num2) / 2;
        return promedionotas;
    }
    public static void main(String[] args) {
        System.out.println(Promedio(5, 3));
    }
    
}