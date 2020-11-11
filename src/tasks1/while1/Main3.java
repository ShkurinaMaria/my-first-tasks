package tasks1.while1;

public class Main3 {
    public static void main(String[] args) {
        int n = 777;
        int k = 5;
        int count = 0;

        while (k <= n ) {
            n = n - k;
            count++;
        }
        System.out.println("Частное = " + count);
        System.out.println("Остаток от частного = " + n);
    }
}