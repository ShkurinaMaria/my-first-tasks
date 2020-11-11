package tasks1.while1;

import oop.Main;

public class Main5 {
    public static void main(String[] args) {
        int n = 466;
        int a = 2;
        int count = 0;
        while (a < n || a == n) {
            a *= 2;
            count++;
        }
        System.out.println("Показатель степени = " + count);
    }
}
