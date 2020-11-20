package tasks1.proc;

public class Main20 {
    public static void main(String[] args) {
        System.out.println(traingleP(4, 7));
        System.out.println(traingleP(5, 9));
        System.out.println(traingleP(7, 8));
    }

    static double traingleP(float a, float h) {
        return Math.pow((a / 2), 2) + Math.pow(h, 2);
    }
}
