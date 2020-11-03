package tasks1.conditions;

public class Main4 {
    public static void main(String[] args) {
        int a = 4;
        int b = 9;
        int c = 5;

        if (a > 0 && b > 0 && c > 0) {
            System.out.println(3);
        } else {
            if (a > 0 && b > 0 || a > 0 && c > 0 || c > 0 && b > 0) {
                System.out.println(2);
            }
        }
        if (a < 0 && b < 0 && c < 0) {
            System.out.println(0);
        } else {
            if (a < 0 && b < 0 || a < 0 && c < 0 || c < 0 && b < 0) {
                System.out.println(1);
            }
        }
    }
}