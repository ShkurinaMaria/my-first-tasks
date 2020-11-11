package tasks1.while1;

public class Main2 {
    public static void main(String[] args) {
        int a = 40;
        int b = 5;
        int n = 0;

        while (b <= a) {
            a = a - b;
            n++;
        }
        System.out.println("Максимальное количество = " + n);
    }
}