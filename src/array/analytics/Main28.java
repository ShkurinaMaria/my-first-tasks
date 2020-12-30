package array.analytics;

public class Main28 {
    public static void main(String[] args) {
        int[][] matrix = Util.generateRandomMatrix(4, 5);
        Util.printMatrix(matrix);
        Main28.printMinIsMaxInColumns(matrix, 5);
    }

    static void printMinIsMaxInColumns(int[][] matrix, int columns) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int j = 0; j < columns; j++) {
            for (int[] ints : matrix) {
                if (ints[j] > max) {
                    max = ints[j];
                }
            }
            if (min > max) {
                min = max;
            }
            max = Integer.MIN_VALUE;
        }
        System.out.println("Минимальное среди максимальных = " + min);
    }
}