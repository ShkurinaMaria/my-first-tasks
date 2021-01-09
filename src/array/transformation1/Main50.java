package array.transformation1;

import array.matrix.Util;

import java.util.Arrays;

public class Main50 {
    public static void main(String[] args) {
        int[][] matrix = Util.generateRandomMatrix(4, 7);
        Util.printMatrix(matrix);
        Main50.changeMinAndMaxInColumns(matrix, 4);
    }

    static void changeMinAndMaxInColumns(int[][] matrix, int columns) {
        int digit = 0, idx = 0, idx1 = 0;
        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
        for (int j = 0; j < columns; j++) {
            for (int i = 0; i < matrix.length; i++) {
                if (matrix[i][j] < min) {
                    min = matrix[i][j];
                    idx = i;

                }
                if (matrix[i][j] > max) {
                    max = matrix[i][j];
                    idx1 = i;
                }
            }
            min = Integer.MAX_VALUE;
            max = Integer.MIN_VALUE;
            digit = matrix[idx1][j];
            matrix[idx1][j] = matrix[idx][j];
            matrix[idx][j] = digit;
        }
        System.out.println(Arrays.deepToString(matrix));
    }
}
