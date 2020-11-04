package tasks1.conditions;

public class Main15 {
    public static void main(String[] args) {
        int a = 10;
        int b = 4;
        int c = 6;
        int min = a;

        if (b < min) {
            min = b;
        }
        if (c < min) {
            min = c;
        }
        System.out.println(a + b + c - min);
    }
}
