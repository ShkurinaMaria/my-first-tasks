package tasks1.bool;

public class Main40 {
    public static void main(String[] args) {
        int x = 4, y = 3;
        int x1 = 5, y1 = 4;

        boolean case1 = x + 2 == x1 && y + 1 == y1;
        boolean case2 = x + 2 == x1 && y - 1 == y1;
        boolean case3 = x - 2 == x1 && y - 1 == y1;
        boolean case4 = x - 2 == x1 && y + 1 == y1;
        boolean case5 = x + 1 == x1 && y + 2 == y1;
        boolean case6 = x + 1 == x1 && y - 2 == y1;
        boolean case7 = x - 1 == x1 && y - 2 == y1;
        boolean case8 = x - 1 == x1 && y + 2 == y1;

        System.out.println(case1 || case2 || case3 || case4 || case5 || case6 || case7 || case8);
    }
}
