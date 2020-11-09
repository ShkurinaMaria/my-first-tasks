package tasks1.cycle;

public class Main37 {
    public static void main(String[] args) {
        float n = 4;
        float sum = 0;
        for (float i = 1; i <= n; i++) {
            sum += Math.pow(i, i);
        }
        System.out.println(sum);
    }
}

