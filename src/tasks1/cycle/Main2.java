package tasks1.cycle;

public class Main2 {
    public static void main(String[] args) {
        int a = 18;
        int b = 26;
        for (int i = a; i <= b; i++) {
            System.out.println("Число " + i);
        }
        System.out.println("Количество чисел = " + (b - a + 1));
    }
}
