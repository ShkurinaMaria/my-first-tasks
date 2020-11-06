package tasks1.cycle;

public class Main9 {
    public static void main(String[] args) {
        int a = 20;
        int b = 22;
        int sum = 0;
        for (int i = a; i <= b; i++) {
            sum += i * i;
        }
        System.out.println("Сумма квадратов = " + sum);
    }
}
