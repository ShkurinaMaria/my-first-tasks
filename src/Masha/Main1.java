package Masha;

import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) throws DigitLessThanTenException, DigitLessTwentyException {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число: ");
        int x = in.nextInt();
        try {
            if (x > 0 && x < 10) {
                throw new DigitLessThanTenException("Число меньше 10 и больше 0");
            }
            if (x > 10 && x < 20) {
                throw new DigitLessTwentyException("Число меньше 20 и больше 10");
            }
            System.out.println(x);
        } catch (Exception f){
            System.out.println(x);
            System.out.println("Сработало исключение, " + f.getMessage());
        }
    }
}
