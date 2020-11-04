package tasks1.conditions;

public class Main17 {
    public static void main(String[] args) {
        float a = 22;
        float b = 18;
        float c = 2;

        if (a < b && b < c || a > b && b > c) {
            a = a * 2;
            b = b * 2;
            c = c * 2;
        } else {
            a = a * (-1);
            b = b * (-1);
            c = c * (-1);
        }
        System.out.println("a = " + a + ", " + "b = " + b + ", " + "c = " + c);
    }
}


