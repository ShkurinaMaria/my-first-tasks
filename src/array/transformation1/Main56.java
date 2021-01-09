package array.transformation1;

import array.matrix.Util;

import java.util.Arrays;

public class Main56 {
    public static void main(String[] args) {
        int[][] matrix = Util.generateRandomMatrix(4, 6);
        Util.printMatrix(matrix);
        Main56.chengeHalfRow(matrix, 6);
    }

    static void chengeHalfRow(int[][] matrix, int columns) {
        int count = columns / 2, digit = 0;
        for (int j = 0; j < columns / 2; j++) {
            for (int i = 0; i < matrix.length; i++) {
                digit = matrix[i][j];
                matrix[i][j] = matrix[i][count];
                matrix[i][count] = digit;
            }
            if (count < columns - 1) {
                count++;
            }
        }
        System.out.println(Arrays.deepToString(matrix));
    }
}
