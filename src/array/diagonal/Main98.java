package array.diagonal;

import array.matrix.Util;

public class Main98 {
    public static void main(String[] args) {
        int[][] matrix = Util.generateRandomSquareMatrix(3);
        Util.printMatrix(matrix);
        Util.printMatrix(Main98.mirrorDigitDiagonal(matrix));
    }

    static int[][] mirrorDigitDiagonal(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;

        for (int i = 0; i < m; i++) {
            for (int j = 0, k = n - 1; j < k; j++, k--) {
                Util.swapInMatrix(matrix, i, j, i, k);
            }
        }
        for (int j = 0; j < n; j++) {
            for (int i = 0, k = m - 1; i < k; i++, k--) {
                Util.swapInMatrix(matrix, i, j, k, j);
            }
        }
        return matrix;
    }
}