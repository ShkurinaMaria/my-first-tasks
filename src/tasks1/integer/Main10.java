package tasks1.integer;

public class Main10 {
    public static void main(String[] args) {
        int a = 123;
        int w = a / 100;
        int v = a / 10;
        int c = v % 10;
        System.out.println("Первая цифра числа " + a + " = " + w);
        System.out.println("Первая цифра числа " + a + " = " + c);
    }
}
