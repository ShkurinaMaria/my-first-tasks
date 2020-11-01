package tasks1.bool;

public class Main16 {
    public static void main(String[] args) {
        int a = 7;
        System.out.println("Число является четным двухзначным числом " + (a % 2 == 0 && 10 <= a && a <= 99));
    }
}
