package array.diagonal;

import array.matrix.Util;

import java.util.Arrays;

public class Main87 {
    public static void main(String[] args) {
        int[][] matrix = Util.generateRandomSquareMatrix(4);
        Util.printMatrix(matrix);
        System.out.println(Arrays.toString(maxDigitDiagonal(matrix)));
    }

    static int[] maxDigitDiagonal(int[][] matrix) {
        int[] maxs = new int[matrix.length * 2 - 1];
        int r = 0, t = 0, p = 0;
        for (int v = 0; v < matrix.length * 2 - 1; v++) {
            int max = Integer.MIN_VALUE;
            for (int i = p, j = t; i <= r && j >= 0; i++, j--) {
                max = matrix[i][j] > max ? matrix[i][j] : max;
            }
            maxs[v] = max;
            if (v < matrix.length - 1) {
                t++;
                r++;
            } else {
                p++;
            }
        }
        return maxs;
    }
}