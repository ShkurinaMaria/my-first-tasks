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
        for (int x = 0; x < m / 2; x++) {
            for (int y = x; y < m - x - 1; y++) {
                int temp = matrix[x][y];
                matrix[x][y] = matrix[y][m - 1 - x];
                matrix[y][m - 1 - x] = matrix[m - 1 - x][m - 1 - y];
                matrix[m - 1 - x][m - 1 - y] = matrix[m - 1 - y][x];
                matrix[m - 1 - y][x] = temp;
            }
        }
        return matrix;
    }
}