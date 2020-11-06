package tasks1.cycle;

public class Main3 {
    public static void main(String[] args) {
        int a = 18;
        int b = 26;
        for (int i = b; i > a; i--) {
            System.out.println("Число " + i);
        }
        System.out.println("Количество чисел = " + (b - a));
    }
}
