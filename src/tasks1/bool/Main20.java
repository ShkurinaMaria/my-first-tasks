package tasks1.bool;

public class Main20 {
    public static void main(String[] args) {
        int a = 111;
        int b1 = a / 100;
        int b2 = (a / 10) % 10;
        int b3 = a % 10;
        System.out.println("Все цифры данного числа различны " + a + " " + (b1 != b2 && b1 != b3 && b2 != b3));

    }
}
