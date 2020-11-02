package tasks1.bool;

public class Main21 {
    public static void main(String[] args) {
        int a = 439;
        int b1 = a / 100;
        int b2 = (a / 10) % 10;
        int b3 = a % 10;
        System.out.println("Цифры данного числа образуют возрастающую последовательность " + a + " " + (b1 < b2 && b2 < b3 && b1 < b3));

    }
}
