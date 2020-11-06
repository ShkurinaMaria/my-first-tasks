package tasks1.cycle;

public class Main11 {
    public static void main(String[] args) {
        int n = 2;
        int sum = 0;
        for (int i = 0; i <= n; i++) {
            sum += (n + i) * (n + i);
        }
        System.out.println("Сумма = " + sum);
    }
}
