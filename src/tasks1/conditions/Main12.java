package tasks1.conditions;

public class Main12 {
    public static void main(String[] args) {
        int a = 9, b = 383, c = 38;
        if (a > b && b > c || c > b && b > a) {
            System.out.println(b);
        }
        if (b > a && a > c || c > a && a > b) {
            System.out.println(a);
        }
        if (b > c && c > a || a > c && c > b) {
            System.out.println(c);
        }
    }
}
