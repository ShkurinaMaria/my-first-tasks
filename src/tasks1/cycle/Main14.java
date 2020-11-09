package tasks1.cycle;

public class Main14 {
    public static void main(String[] args) {
        int n = 3;
        float sum = 0;
        for (float i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                sum += i + (2 * n - 1);
            }
        }
    }
}