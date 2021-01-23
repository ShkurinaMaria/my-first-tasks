package array.transformation1;

import array.matrix.Util;

public class Main50 {
    public static void main(String[] args) {
        int[][] matrix = Util.generateRandomMatrix(4, 7);
        Util.printMatrix(matrix);
        Util.printMatrix(Main50.changeMinAndMaxInColumns(matrix, 4));
    }

    static int[][] changeMinAndMaxInColumns(int[][] matrix, int columns) {
        int idx = 0, idx1 = 0;
        for (int j = 0; j < columns; j++) {
            int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
            for (int i = 0; i < matrix.length; i++) {
                if (matrix[i][j] < min) {
                    min = matrix[i][j];
                    idx = i;
                }
                if (matrix[i][j] > max) {
                    max = matrix[i][j];
                    idx1 = i;
                }
            }
            Util.swapInMatrix(idx1, j, idx, j);
        }
        return matrix;
    }
}
