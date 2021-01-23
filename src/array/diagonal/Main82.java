package array.diagonal;

import array.matrix.Util;

import java.util.Arrays;

public class Main82 {
    public static void main(String[] args) {
        int[][] matrix = Util.generateRandomSquareMatrix(4);
        Util.printMatrix(matrix);
        System.out.println(Arrays.toString(sumDigitDiagonal(matrix)));
    }

    static int[] sumDigitDiagonal(int[][] matrix) {
        int[] sums = new int[matrix.length * 2 - 1];
        int r = 0, t = matrix.length - 1;
        for (int v = 0; v < matrix.length * 2 - 1; v++) {
            sums[v] = 0;
            for (int i = 0, j = matrix.length - 1 - r; i <= r && j >= t; i++, j++) {
                sums[v] += v < matrix.length ? matrix[i][j] : matrix[j][i];
            }
            if (v < matrix.length - 1) {
                t--;
                r++;
            } else {
                t++;
                r--;
            }
        }
        return sums;
    }
}