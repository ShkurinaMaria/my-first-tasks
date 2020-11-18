package tasks1.while1;

public class Main29 {
    public static void main(String[] args) {
        float n1 = 1;
        float n2 = 2;
        float e = 0.32f;
        int count = 2;
        while (e > Math.abs(n2 - n1) || count == 2) {
            float temp = n2;
            n2 = (n1 + 2 * n2) / 3;
            n1 = temp;
            count++;
        }
        System.out.println(count);
        System.out.println(n1 + " и " + n2);
    }
}
