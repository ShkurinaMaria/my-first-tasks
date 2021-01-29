package array.diagonal;

import array.matrix.Util;

import java.util.Arrays;

public class Main83 {
    public static void main(String[] args) {
        int[][] matrix = Util.generateRandomSquareMatrix(4);
        Util.printMatrix(matrix);
        System.out.println(Arrays.toString(sumDigitDiagonal(matrix)));
    }

    static int[] sumDigitDiagonal(int[][] matrix) {
        int[] sums = new int[matrix.length * 2 - 1];
        int r = 0;
        int t = 0;
        int p = 0;
        for (int v = 0; v < matrix.length * 2 - 1; v++) {
            sums[v] = 0;
            for (int i = p, j = t; i <= r && j >= 0; i++, j--) {
                sums[v] += matrix[i][j];
            }
            if (v < matrix.length - 1) {
                t++;
                r++;
            } else {
                p++;
            }
        }
        return sums;
    }
}