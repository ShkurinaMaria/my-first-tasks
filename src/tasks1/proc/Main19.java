package tasks1.proc;

public class Main19 {
    public static void main(String[] args) {
        System.out.println(ringS(33, 24));
        System.out.println(ringS(5, 1));
        System.out.println(ringS(9, 4));
    }

    static double ringS(double r1, double r2) {
        return (Math.pow(r1, 2) * 3.14) - (Math.pow(r2, 2) * 3.14);
    }
}
