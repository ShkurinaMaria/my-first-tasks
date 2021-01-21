package array.transformation1;

import array.matrix.Util;

public class Main56 {
    public static void main(String[] args) {
        int[][] matrix = Util.generateRandomMatrix(4, 6);
        Util.printMatrix(matrix);
        Util.printMatrix(Main56.chengeHalfRow(matrix, 6));
    }

    static int[][] chengeHalfRow(int[][] matrix, int columns) {
        int temp = 0;
        for (int j = 0; j < columns / 2; j++) {
            for (int i = 0; i < matrix.length; i++) {
                temp = matrix[i][j];
                matrix[i][j] = matrix[i][columns / 2 + j];
                matrix[i][columns / 2 + j] = temp;
            }
        }
        return matrix;
    }
}
