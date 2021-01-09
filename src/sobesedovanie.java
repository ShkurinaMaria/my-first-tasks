import java.util.Scanner;

public class sobesedovanie {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        int num1 = s.nextInt();
        sobesedovanie sobesedovanie1 = new sobesedovanie();
        System.out.println(sobesedovanie1.Sum(num, num1));
    }

    int Sum(int x, int y) {
        return x + y;
    }
}
