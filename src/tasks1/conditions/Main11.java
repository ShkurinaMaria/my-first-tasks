package tasks1.conditions;

public class Main11 {
    public static void main(String[] args) {
        int a = 14;
        int b = 14;

        if (a != b) {
            int max = a > b ? a : b;
            a = b = max;
        } else {
            a = b = 0;
        }
        System.out.println("a = " + a + ", b = " + b);
    }
}

