package array.diagonal;

import array.matrix.Util;

public class Main80 {
    public static void main(String[] args) {
        int[][] matrix = Util.generateRandomSquareMatrix(6);
        Util.printMatrix(matrix);
        Util.printMatrix(Main80.sumDigitDiagonal(matrix));
    }

    static int[][] sumDigitDiagonal(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {

            }
        }                return matrix;

    }
}