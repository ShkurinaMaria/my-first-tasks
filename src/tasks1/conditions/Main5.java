package tasks1.conditions;

public class Main5 {
    public static void main(String[] args) {
        int a = -4;
        int b = -9;
        int c = -5;

        if (a > 0 && b > 0 && c > 0) {
            System.out.println("Количество положительных чисел = " + 3);
            System.out.println("Количество отрицательных чисел = " + 0);

        } else {
            if (a > 0 && b > 0 || a > 0 && c > 0 || c > 0 && b > 0) {
                System.out.println("Количество положительных чисел = " + 2);
                System.out.println("Количество отрицательных чисел = " + 1);
            }
        }
        if (a < 0 && b < 0 && c < 0) {
            System.out.println("Количество положительных чисел = " + 0);
            System.out.println("Количество отрицательных чисел = " + 3);
        } else {
            if (a < 0 && b < 0 || a < 0 && c < 0 || c < 0 && b < 0) {
                System.out.println("Количество положительных чисел = " + 1);
                System.out.println("Количество отрицательных чисел = " + 2);
            }
        }
    }
}

