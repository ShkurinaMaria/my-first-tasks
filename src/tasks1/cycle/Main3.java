package tasks1.cycle;

public class Main3 {
    public static void main(String[] args) {
        int a = 18;
        int b = 26;
        int a1 = a + 1;
        int b1 = b - 1;
        for (int i = a1; i < b1; i++) {
            System.out.println("Число " + i);
        }
        System.out.println("Количество чисел = " + (b1 - a1));
    }
}
