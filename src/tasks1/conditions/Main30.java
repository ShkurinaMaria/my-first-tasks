package tasks1.conditions;

public class Main30 {
    public static void main(String[] args) {
        int a = 133;

        if (a > 1 && a < 100 && a % 2 == 0) {
            System.out.println("Четное двузначное число ");
        }
        if (a > 100 && a < 1000 && a % 2 != 0) {
            System.out.println("Нечетное трехзначное число ");
        }
    }
}
