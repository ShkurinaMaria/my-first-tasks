package array.transformation1;

import array.matrix.Util;

public class Main51 {
    public static void main(String[] args) {
        int[][] matrix = Util.generateRandomMatrix(6, 4);
        Util.printMatrix(matrix);
        Util.printMatrix(Main51.changeMinAndMaxInRow(matrix, 4));
    }

    static int[][] changeMinAndMaxInRow(int[][] matrix, int columns) {
        int idxRowMin = 0, idxRowMax = 0;
        for (int i = 0; i < matrix.length; i++) {
            int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] < min) {
                    min = matrix[i][j];
                    idxRowMin = i;
                }
                if (matrix[i][j] > max) {
                    max = matrix[i][j];
                    idxRowMax = i;
                }
            }
        }
        for (int i = 0; i < columns; i++) {
            Util.swapInMatrix(matrix, idxRowMax, i, idxRowMin, i);
        }
        return matrix;
    }
}
