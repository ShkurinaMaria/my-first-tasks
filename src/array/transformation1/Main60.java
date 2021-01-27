package array.transformation1;

import array.matrix.Util;

public class Main60 {
    public static void main(String[] args) {
        int[][] matrix = Util.generateRandomMatrix(4, 6);
        Util.printMatrix(matrix);
        Util.printMatrix(Main60.changeHalfColumns(matrix));
    }

    static int[][] changeHalfColumns(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length / 2; j++) {
                Util.swapInMatrix(matrix, i, j, i, matrix[i].length - 1 - j);
            }
        }
        return matrix;
    }
}
