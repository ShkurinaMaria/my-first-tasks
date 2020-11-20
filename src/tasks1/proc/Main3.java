package tasks1.proc;

public class Main3 {
    public static void main(String[] args) {
        double aMean = 0;
        double gMean = 0;
        mean(3, 5, aMean, gMean);
        mean(3, 6, aMean,gMean);
        mean(3, 7, aMean,gMean);
    }

    static void mean(double x, double y, double aMean, double gMean) {
        aMean = (x + y) / 2;
        gMean = Math.sqrt((x * y));
        System.out.println("Среднее арифметическое = " + aMean);
        System.out.println("Среднее геометрическое = " + gMean);
    }
}
