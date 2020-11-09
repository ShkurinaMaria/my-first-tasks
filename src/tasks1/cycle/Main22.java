package tasks1.cycle;

public class Main22 {
    public static void main(String[] args) {
        int n = 5;
        float x = 2.0f;
        float sum = 0;
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
            sum += (Math.pow(x, i)) / fact;
        }
        System.out.println(1 + sum);
    }
}
