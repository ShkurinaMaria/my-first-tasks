package tasks1.proc;

public class Main4 {
    public static void main(String[] args) {
        double p = 5;
        double s = 11f;
        trianglePS(22, p, s);
    }

    static void trianglePS(double a, double p, double s) {
        p = (float) (3 * a);
        s = Math.pow(a, 2) * Math.sqrt(((float) 3 / 4));
        System.out.println("Периметр = " + p);
        System.out.println("Площадь = " + s);
    }
}

