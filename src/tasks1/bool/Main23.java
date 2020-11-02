package tasks1.bool;

public class Main23 {
    public static void main(String[] args) {
        int a = 4444;
        int b1 = a / 1000;
        int b2 = (a / 100) % 10;
        int b3 = (a / 10) % 10;
        int b4 = a % 10;
        System.out.println("Данное числоо читается одинаково слева направо и справо налево " + a + " " + (b1 == b4 && b2 == b3));
    }
}
