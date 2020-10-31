package tasks1.integer;

public class Main11 {
    public static void main(String[] args) {
        int a = 153;
        int w = a % 10;
        int v = a / 10;
        int x = v % 10;
        int c = a / 100;
        System.out.println("Сумма цифр числа " + a + " = " + (w + x + c));
        System.out.println("Произведение цифр числа " + a + " = " + (w * x * c));
    }
}
