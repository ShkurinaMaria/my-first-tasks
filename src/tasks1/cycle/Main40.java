package tasks1.cycle;

public class Main40 {
    public static void main(String[] args) {
        int a = 6;
        int b = 10;
        int count = 1;
        for (int i = a; i <= b; i++) {
            for (int j = 0; j < count; j++) {
                System.out.print(i + " ");
            }
            count++;
            System.out.println();
        }
    }
}

