package array.diagonal;

import array.matrix.Util;

import java.util.Arrays;

public class Main86 {
    public static void main(String[] args) {
        int[][] matrix = Util.generateRandomSquareMatrix(4);
        Util.printMatrix(matrix);
        System.out.println(Arrays.toString(minDigitDiagonal(matrix)));
    }

    static int[] minDigitDiagonal(int[][] matrix) {
        int[] mins = new int[matrix.length * 2 - 1];
        int r = 0, t = matrix.length - 1;
        for (int v = 0; v < matrix.length * 2 - 1; v++) {
            int min = Integer.MAX_VALUE;
            for (int i = 0, j = matrix.length - 1 - r; i <= r && j >= t; i++, j++) {
                min = matrix[i][j] < min  && v < matrix.length? matrix[i][j] : min;
                min = matrix[j][i] < min  && v >= matrix.length? matrix[j][i] : min;
            }
            mins [v] = min;
            if (v < matrix.length - 1) {
                t--;
                r++;
            } else {
                t++;
                r--;
            }
        }
        return mins;
    }
}