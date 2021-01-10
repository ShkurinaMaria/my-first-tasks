package array.transformation1;

import array.matrix.Util;

import java.util.Arrays;

public class Main59 {
    public static void main(String[] args) {
        int[][] matrix = Util.generateRandomMatrix(6, 6);
        Util.printMatrix(matrix);
        Main59.chengeHalfRow(matrix, 6, 6);
    }

    static void chengeHalfRow(int[][] matrix, int rows, int columns) {
        int digit = 0, count = 0;
        for (int i = 0; i < rows / 2; i++) {
            for (int j = 0; j < columns; j++) {
                digit = matrix[i][j];
                matrix[i][j] = matrix[matrix.length - 1 - count][j];
                matrix[matrix.length - 1 - count][j] = digit;
            }
            if (i < rows / 2) {
                count++;
            }
        }
        System.out.println(Arrays.deepToString(matrix));
    }
}
