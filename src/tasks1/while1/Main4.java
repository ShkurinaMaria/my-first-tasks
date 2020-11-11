package tasks1.while1;

import oop.Main;

public class Main4 {
    public static void main(String[] args) {
        int n = 27;
        int a = 3;
        boolean flag = false;
        while (a < n) {
            a *= 3;
            flag = a == n;
        }
        System.out.println(flag);
    }
}
