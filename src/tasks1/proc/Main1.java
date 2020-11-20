package tasks1.proc;

public class Main1 {
    public static void main(String[] args) {
        double a = 5;
        double b = 1;
        procA3(a, b);
        procA3(a, b);
        procA3(a, b);
        procA3(a, b);
        procA3(a, b);
    }

    static void procA3(double a, double b) {
            b =  Math.pow(a, 3);
        System.out.println(b);
    }
}


