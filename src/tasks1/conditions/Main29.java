package tasks1.conditions;

public class Main29 {
    public static void main(String[] args) {
        int a = 7777;
        if (a < 0 && a % 2 == 0) {
            System.out.println("Отрицательное четное число ");
        }
        if (a == 0) {
            System.out.println("Нулевое число ");
        }
        if (a > 0 && a % 2 != 0) {
            System.out.println("Положиетльное нечетное число ");
        }
    }
}
