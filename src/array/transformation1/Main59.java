package array.transformation1;

import array.matrix.Util;

public class Main59 {
    public static void main(String[] args) {
        int[][] matrix = Util.generateRandomMatrix(4, 2);
        Util.printMatrix(matrix);
        Util.printMatrix(Main59.chengeHalfRow(matrix));
    }

    static int[][] chengeHalfRow(int[][] matrix) {
        int temp = 0;
        for (int i = 0; i < matrix.length / 2; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                temp = matrix[i][j];
                matrix[i][j] = matrix[matrix.length - 1 - i][j];
                matrix[matrix.length - 1 - i][j] = temp;
            }
        }
        return matrix;
    }
}
