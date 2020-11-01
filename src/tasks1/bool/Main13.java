package tasks1.bool;

public class Main13 {
    public static void main(String[] args) {
        int a = -3;
        int b = -6;
        int c = -18;
        System.out.println("Хотя бы одно из чисел является положительным " + (a > 0 || b > 0 || c > 0));
    }
}
