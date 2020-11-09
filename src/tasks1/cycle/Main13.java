package tasks1.cycle;

public class Main13 {
    public static void main(String[] args) {
        float n = 5;
        float subt = 0;
        for (float i = 1; i <= n; i++) {
            if (i % 2 != 0) {
                subt = subt + (1 + (float) i / 10);
            } else {
                subt -= (1 + (float) i / 10);
            }
        }
        System.out.println("Сумма и разность = " + subt);
    }
}
