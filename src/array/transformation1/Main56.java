package array.transformation1;

import array.matrix.Util;

public class Main56 {
    public static void main(String[] args) {
        int[][] matrix = Util.generateRandomMatrix(4, 6);
        Util.printMatrix(matrix);
        Util.printMatrix(Main56.chengeHalfRow(matrix, 6));
    }

    static int[][] chengeHalfRow(int[][] matrix, int columns) {
        for (int j = 0; j < columns / 2; j++) {
            for (int i = 0; i < matrix.length; i++) {
                Util.swapInMatrix(i, j, i, columns / 2 + j);
            }
        }
        return matrix;
    }
}
