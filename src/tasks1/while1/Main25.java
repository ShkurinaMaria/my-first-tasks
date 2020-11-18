package tasks1.while1;

public class Main25 {
    public static void main(String[] args) {
        int n0 = 1;
        int n1 = 1;
        int n2 = 0;
        int n = 45;
        while (n > n2) {
                n2 = n0 + n1;
                n0 = n1;
                n1 = n2;
        }
        System.out.println(n2);
    }
}
