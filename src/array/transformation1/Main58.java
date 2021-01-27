package array.transformation1;

import array.matrix.Util;

public class Main58 {
    public static void main(String[] args) {
        int[][] matrix = Util.generateRandomMatrix(6, 4);
        Util.printMatrix(matrix);
        Util.printMatrix(Main58.changeHalfRow(matrix, 6, 4));
    }

    static int[][] changeHalfRow(int[][] matrix, int rows, int columns) {
        for (int i = rows / 2; i < rows; i++) {
            for (int j = 0; j < columns / 2; j++) {
                Util.swapInMatrix(matrix, i, j, i - rows / 2, j + columns / 2);
            }
        }
        return matrix;
    }
}
