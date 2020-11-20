package tasks1.proc;

public class Main17 {
    public static void main(String[] args) {
        System.out.println(rootCount(2, 5, -7));
        System.out.println(rootCount(16, 8, 1));
        System.out.println(rootCount(9, 6, 2));
    }

    static int rootCount(int a, int b, int c) {
        if ((Math.pow((double) b, 2) - 4 * a * c) > 0) {
            return 2;
        }
        if ((Math.pow((double) b, 2) - 4 * a * c) == 0) {
            return 1;
        }
        return 0;
    }
}
