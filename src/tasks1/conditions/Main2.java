package tasks1.conditions;

public class Main2 {
    public static void main(String[] args) {
        int a = 6;
        if (a > 0) {
            a += 1;
        } else {
            a -= 2;
        }
        System.out.println(a);
        int b = -5;
        int result = b > 0 ? b + 1 : b - 2;
        b = result;
        System.out.println(result);
    }
}
