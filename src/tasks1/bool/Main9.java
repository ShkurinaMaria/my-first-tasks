package tasks1.bool;

public class Main9 {
    public static void main(String[] args) {
        int a = 14;
        int b = 16;
        System.out.println("Хотя бы одно из чисел " + a + " и " + b + " является нечетным " + " = " + (a % 2 != 0 || b % 2 != 0));
    }
}
