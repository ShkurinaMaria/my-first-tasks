package array.diagonal;

import array.matrix.Util;

public class Main97 {
    public static void main(String[] args) {
        int[][] matrix = Util.generateRandomSquareMatrix(4);
        Util.printMatrix(matrix);
        Util.printMatrix(Main97.mirrorDigitDiagonal(matrix));
    }

    static int[][] mirrorDigitDiagonal(int[][] matrix) {
        int m = matrix.length, p = 0;
        for (int j = 0; j < m - 1; j++) {
            for (int i = 0; i < m - p; i++) {
                Util.swapInMatrix(matrix, i, j, m - p - 1, m - i - 1);
            }
            p++;
        }
        return matrix;
    }
}
