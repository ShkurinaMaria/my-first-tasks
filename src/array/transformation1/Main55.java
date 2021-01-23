package array.transformation1;

import array.matrix.Util;

public class Main55 {
    public static void main(String[] args) {
        int[][] matrix = Util.generateRandomMatrix(6, 6);
        Util.printMatrix(matrix);
        Util.printMatrix(Main55.chengeHalfRow(matrix));
    }

    static int[][] chengeHalfRow(int[][] matrix) {
        for (int i = 0; i < matrix.length / 2; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                Util.swapInMatrix(i, j, matrix.length / 2 + i, j);
            }
        }
        return matrix;
    }
}
