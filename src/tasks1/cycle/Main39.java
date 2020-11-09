package tasks1.cycle;

public class Main39 {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;
        for (int i = a; i <= b; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
