package tasks1.cycle;

public class Main10 {
    public static void main(String[] args) {
        int n = 15;
        float sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += (float) 1 / i;
        }
        System.out.println("Сумма чисел в (-1) степени " + sum);
    }
}
