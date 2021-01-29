package array.diagonal;

import array.matrix.Util;

public class Main99 {
    public static void main(String[] args) {
        int[][] matrix = Util.generateRandomSquareMatrix(3);
        Util.printMatrix(matrix);
        Util.printMatrix(Main99.mirrorDigitDiagonal(matrix));
    }

    static int[][] mirrorDigitDiagonal(int[][] matrix) {
        int m = matrix.length;
        for (int i = 0; i < m / 2; i++) {
            for (int j = i; j < m - i - 1; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][m - 1 - i];
                matrix[j][m - 1 - i] = matrix[m - 1 - i][m - 1 - j];
                matrix[m - 1 - i][m - 1 - j] = matrix[m - 1 - j][i];
                matrix[m - 1 - j][i] = temp;
            }
        }
        return matrix;
    }
}