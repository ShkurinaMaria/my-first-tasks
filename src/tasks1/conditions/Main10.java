package tasks1.conditions;

public class Main10 {
    public static void main(String[] args) {
        int a = 1;
        int b = 13;
        if (a != b) {
            a += b;
            b = a;
        } else {
            a = b = 0;
        }
        System.out.println("a = " + a + ", b = " + b);
    }
}


