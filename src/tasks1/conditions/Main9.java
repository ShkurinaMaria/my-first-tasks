package tasks1.conditions;

public class Main9 {
    public static void main(String[] args) {
        float a = 10f;
        float b = -13f;
        if (a > b) {
            float trm;
            trm = a;
            a = b;
            b = trm;
        }
        System.out.println("a = " + a + ", b = " + b);
    }
}