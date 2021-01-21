package array.transformation1;

import array.matrix.Util;

public class Main60 {
    public static void main(String[] args) {
        int[][] matrix = Util.generateRandomMatrix(4, 6);
        Util.printMatrix(matrix);
        Util.printMatrix(Main60.chengeHalfColumns(matrix));
    }

    static int[][] chengeHalfColumns(int[][] matrix) {
        int temp = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length / 2; j++) {
                temp = matrix[i][j];
                matrix[i][j] = matrix[i][matrix[i].length - 1 - j];
                matrix[i][matrix[i].length - 1 - j] = temp;
            }
        }
        return matrix;
    }
}
