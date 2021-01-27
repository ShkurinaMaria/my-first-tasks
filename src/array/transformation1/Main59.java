package array.transformation1;

import array.matrix.Util;

public class Main59 {
    public static void main(String[] args) {
        int[][] matrix = Util.generateRandomMatrix(4, 2);
        Util.printMatrix(matrix);
        Util.printMatrix(Main59.changeHalfRow(matrix));
    }

    static int[][] changeHalfRow(int[][] matrix) {
        for (int i = 0; i < matrix.length / 2; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                Util.swapInMatrix(matrix, i, j, matrix.length - 1 - i, j);
            }
        }
        return matrix;
    }
}
