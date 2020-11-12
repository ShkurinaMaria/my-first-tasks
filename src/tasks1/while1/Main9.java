package tasks1.while1;

public class Main9 {
    public static void main(String[] args) {
        int n = 254;
        int mult = 3;
        int count = 0;
        while (mult <= n) {
            mult *= 3;
            count++;
        }
        System.out.println(count);
    }
}
