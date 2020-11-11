package tasks1.while1;

public class Main6 {
    public static void main(String[] args) {
        int n = 35;
        float square = 0;
        int count = 0;

        while (square < n || square == n) {
            square = (float) Math.pow(count, 2);
            count++;
        }
        System.out.println(Math.sqrt(square));
    }
}
