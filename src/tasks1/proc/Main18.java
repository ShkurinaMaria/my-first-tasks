package tasks1.proc;

public class Main18 {
    public static void main(String[] args) {
        System.out.println(circleS(2));
        System.out.println(circleS(5));
        System.out.println(circleS(8));
    }

    static double circleS(double r) {
        return Math.pow(r, 2) * 3.14;
    }
}
