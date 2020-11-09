package tasks1.cycle;

public class Main36 {
    public static void main(String[] args) {
        float n = 10;
        float k = 10;
        float sum = 0;
        for (float i = 1; i <= n; i++) {
            sum +=  Math.pow(i, k);
        }
        System.out.println(sum);
    }
}

