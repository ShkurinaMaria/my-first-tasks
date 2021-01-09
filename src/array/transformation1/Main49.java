package array.transformation1;

import array.matrix.Util;

import java.util.Arrays;

public class Main49 {
    public static void main(String[] args) {
        int[][] matrix = Util.generateRandomMatrix(4, 4);
        Util.printMatrix(matrix);
        Main49.changeMinAndMaxInRow(matrix);
    }

    static void changeMinAndMaxInRow(int[][] matrix) {
        int digit = 0;
        int idx = 0;
        int idx1 = 0;
        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                if (matrix[i][j] < min) {
                    min = matrix[i][j];
                    idx = j;

                }
                if (matrix[i][j] > max) {
                    max = matrix[i][j];
                    idx1 = j;
                }
            }
            min = Integer.MAX_VALUE;
            max = Integer.MIN_VALUE;
            digit = matrix[i][idx1];
            matrix[i][idx1] = matrix[i][idx];
            matrix[i][idx] = digit;
        }
        System.out.println(Arrays.deepToString(matrix));
    }
}
