package tasks1.cycle;

public class Main20 {
    public static void main(String[] args) {
        float n = 3 ;
        float sum = 0;
        float fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
            sum += fact;
        }
        System.out.println("Факториал  = " + sum);
    }
}
