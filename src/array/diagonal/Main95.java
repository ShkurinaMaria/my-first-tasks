package array.diagonal;

import array.matrix.Util;

import java.util.Arrays;

public class Main95 {
    public static void main(String[] args) {
        int[][] matrix = Util.generateRandomSquareMatrix(5);
        Util.printMatrix(matrix);
        Util.printMatrix(zeroDigitDiagonal(matrix));
    }

    static int[][] zeroDigitDiagonal(int[][] matrix) {
        int m = matrix.length, p = 0;
        for (int i = m - 1; i >= m / 2; i--) {
            for (int j = p; j < m - p; j++) {
                matrix[i][j] = 0;
            }
            p++;
        }
        return matrix;
    }
}
