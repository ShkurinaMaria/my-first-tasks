package array.analytics;

public class Main24 {
    public static void main(String[] args) {
        int[][] matrix = Util.generateRandomMatrix(3, 5);
        Util.printMatrix(matrix);
        Main24.printMaxIsColumns(matrix, 5);
    }

    static void printMaxIsColumns(int[][] matrix, int columns) {
        int max = Integer.MIN_VALUE;
        for (int j = 0; j < columns; j++) {
            for (int[] ints : matrix) {
                if (ints[j] > max) {
                    max = ints[j];
                }
            }
            System.out.println("Максимальное число в столбце = " + max);
            max = Integer.MIN_VALUE;
        }
    }
}