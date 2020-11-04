package tasks1.conditions;

public class Main28 {
    public static void main(String[] args) {
        int a = 1300;
        if (a % 4 == 0 && a % 100 == 0 && a % 400 ==0) {
            System.out.println(a * 366);
        } else {
            System.out.println(a * 365);
        }
    }
}
