package array.diagonal;

import array.matrix.Util;

import java.util.Arrays;

public class Main93 {
    public static void main(String[] args) {
        int[][] matrix = Util.generateRandomSquareMatrix(6);
        Util.printMatrix(matrix);
        System.out.println(Arrays.toString(zeroDigitDiagonal(matrix)));
    }

    static int[][] zeroDigitDiagonal(int[][] matrix) {
        int m = matrix.length;
        for (int i = 1; i < m / 2; i++) {
            for (int j = m - i; j < m; j++) {
                matrix[i][j] = 0;
            }
        }
        for (int i = m / 2; i < m - 1; i++) {
            for (int j = i + 1; j < m; j++) {
                matrix[i][j] = 0;
            }
        }
        Util.printMatrix(matrix);
        return matrix;
    }
}
