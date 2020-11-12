package tasks1.while1;

public class Main16 {
    public static void main(String[] args) {
        int n = 1347;
        int c = 1, m = 10;

        while (n / c > 0) {
            System.out.println((n % m) / c);
            c *= 10;
            m *= 10;
        }
    }
}
