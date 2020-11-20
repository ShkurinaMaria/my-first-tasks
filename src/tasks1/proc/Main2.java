package tasks1.proc;

public class Main2 {
    public static void main(String[] args) {
        double a = 5;
        double b = 0;
        double c = 0;
        double d = 0;
        procA3(a, b, c, d);

    }

    static void procA3(double a, double b, double c, double d) {
        b = Math.pow(a, 2);
        c = Math.pow(a, 3);
        d = Math.pow(a, 4);
        System.out.println("Число во второй степени = " + b);
        System.out.println("Число в третьей степени = " + c);
        System.out.println("Число в четвертой степени = " + d);
    }
}


