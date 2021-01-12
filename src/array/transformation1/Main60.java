package array.transformation1;

import array.matrix.Util;

import java.util.Arrays;

public class Main60 {
    public static void main(String[] args) {
        int[][] matrix = Util.generateRandomMatrix(4, 6);
        Util.printMatrix(matrix);
        Main60.chengeHalfColumns(matrix, 4, 6);
    }

    static void chengeHalfColumns(int[][] matrix, int rows, int columns) {
        int digit = 0, count = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns / 2; j++) {
                digit = matrix[i][j];
                matrix[i][j] = matrix[i][matrix[i].length - 1 - count];
                matrix[i][matrix[i].length - 1 - count] = digit;
                count++;
            }
            if (count < matrix[i].length - 1) {
                count = 0;
            }
        }
        System.out.println(Arrays.deepToString(matrix));
    }
}
