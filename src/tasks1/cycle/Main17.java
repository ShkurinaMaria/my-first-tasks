package tasks1.cycle;

public class Main17 {
    public static void main(String[] args) {
        int n = 1;
        float a = 40;
        float sum = 0;
        for (float i = 0; i <= n; i++) {
            sum = sum + (float) Math.pow(a,i);
        }
        System.out.println(sum);
    }
}
