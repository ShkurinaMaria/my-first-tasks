package array.diagonal;

import array.matrix.Util;

import java.util.Arrays;

public class Main92 {
    public static void main(String[] args) {
        int[][] matrix = Util.generateRandomSquareMatrix(5);
        Util.printMatrix(matrix);
        Util.printMatrix(zeroDigitDiagonal(matrix));
    }

    static int[][] zeroDigitDiagonal(int[][] matrix) {
        int m = matrix.length;
        for (int i = 0; i < m / 2; i++) {
            for (int j = i + 1; j < m - i - 1; j++) {
                matrix[i][j] = 0;
            }
        }
        return matrix;
    }
}
