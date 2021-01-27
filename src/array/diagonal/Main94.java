package array.diagonal;

import array.matrix.Util;

import java.util.Arrays;

public class Main94 {
    public static void main(String[] args) {
        int[][] matrix = Util.generateRandomSquareMatrix(6);
        Util.printMatrix(matrix);
        System.out.println(Arrays.toString(zeroDigitDiagonal(matrix)));
    }

    static int[][] zeroDigitDiagonal(int[][] matrix) {
        int m = matrix.length, p = 0;
        for (int j = 0; j <= m / 2; j++) {
            for (int i = p; i < m - p; i++) {
                matrix[i][j] = 0;
            }
            p++;
        }
        Util.printMatrix(matrix);
        return matrix;
    }
}
