package tasks1.while1;

public class Main23 {
    public static void main(String[] args) {
        int a = 60;
        int b = 36;
        while (a != 0 && b != 0) {
            if (a > b) {
                a %= b;
            } else {
                b %= a;
            }
        }
        System.out.println(a + b);
    }
}