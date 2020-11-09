package tasks1.cycle;

public class Main15 {
    public static void main(String[] args) {
        int n = 5;
        float a = 13.0f;
        float mult = 0;
        for (float i = 1; i <= n; i++) {
            mult = (float) Math.pow(a,i);
        }
        System.out.println("Возведение в степень  = " + mult);
    }
}
