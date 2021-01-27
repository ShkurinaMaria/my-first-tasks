package array.transformation1;

import array.matrix.Util;

public class Main49 {
    public static void main(String[] args) {
        int[][] matrix = Util.generateRandomMatrix(6, 4);
        Util.printMatrix(matrix);
        Util.printMatrix(Main49.changeMinAndMaxInRow(matrix));
    }

    static int[][] changeMinAndMaxInRow(int[][] matrix) {
        int idx = 0, idx1 = 0;
        for (int i = 0; i < matrix.length; i++) {
            int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] < min) {
                    min = matrix[i][j];
                    idx = j;
                }
                if (matrix[i][j] > max) {
                    max = matrix[i][j];
                    idx1 = j;
                }
            }
            Util.swapInMatrix(matrix, i, idx1, i, idx);
        }
        return matrix;
    }
}
