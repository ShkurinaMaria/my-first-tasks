package array.diagonal;

import array.matrix.Util;

public class Main96 {
    public static void main(String[] args) {
        int[][] matrix = Util.generateRandomSquareMatrix(5);
        Util.printMatrix(matrix);
        Util.printMatrix(mirrorDigitDiagonal(matrix));
    }

    static int[][] mirrorDigitDiagonal(int[][] matrix) {
        int m = matrix.length, p = 0;
        for (int i = 0; i < m; i++) {
            for (int j = p; j < m; j++) {
                if (i != j) {
                    Util.swapInMatrix(matrix, i, j, j, i);
                }
            }
            p++;
        }
        return matrix;
    }
}
