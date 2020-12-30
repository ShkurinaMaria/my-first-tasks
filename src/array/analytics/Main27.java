package array.analytics;

public class Main27 {
    public static void main(String[] args) {
        int[][] matrix = Util.generateRandomMatrix(5, 4);
        Util.printMatrix(matrix);
        Main27.findMaxIsMinInRow(matrix);
    }

    static void findMaxIsMinInRow(int[][] matrix) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int[] ints : matrix) {
            for (int anInt : ints) {
                if (anInt < min) {
                    min = anInt;
                }
            }
            if (min > max) {
                max = min;
            }
            min = Integer.MAX_VALUE;
        }
        System.out.println("Максимальное среди минимальных = " + max);
    }
}