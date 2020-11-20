package tasks1.proc;

public class Main16 {
    public static void main(String[] args) {
        System.out.println(singX(0) + singX(-2));
    }

    static int singX(int x) {
        if (x < 0) {
            return -1;
        }
        if (x == 0) {
            return 0;
        }
        return 1;
    }
}
