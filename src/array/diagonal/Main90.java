package array.diagonal;

import array.matrix.Util;

import java.util.Arrays;

public class Main90 {
    public static void main(String[] args) {
        int[][] matrix = Util.generateRandomSquareMatrix(8);
        Util.printMatrix(matrix);
        Util.printMatrix(zeroAboveDiagonal(matrix));
    }

    static int[][] zeroAboveDiagonal(int[][] matrix) {
        int[][] arr = new int[matrix.length][matrix.length];
        int r = 0;
        int t = 0;
        int p = 0;
        for (int v = 0; v < matrix.length * 2 - 1; v++) {
            for (int i = p, j = t; i <= r && j >= 0; i++, j--) {
                arr[i][j] = v >= matrix.length - 1 ? 0 : matrix[i][j];
            }
            if (v < matrix.length - 1) {
                t++;
                r++;
            } else {
                p++;
            }
        }
        return arr;
    }
}