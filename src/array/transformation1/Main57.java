package array.transformation1;

import array.matrix.Util;

public class Main57 {
    public static void main(String[] args) {
        int[][] matrix = Util.generateRandomMatrix(4, 6);
        Util.printMatrix(matrix);
        Util.printMatrix(Main57.changeHalfRow(matrix, 4, 6));
    }

    static int[][] changeHalfRow(int[][] matrix, int rows, int columns) {
        for (int i = 0; i < rows / 2; i++) {
            for (int j = 0; j < columns / 2; j++) {
                Util.swapInMatrix(matrix, i, j, rows / 2 + i, j + columns / 2);
            }
        }
        return matrix;
    }
}
