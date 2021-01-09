package array.transformation1;

import array.matrix.Util;

import java.util.Arrays;

public class Main55 {
    public static void main(String[] args) {
        int[][] matrix = Util.generateRandomMatrix(4, 6);
        Util.printMatrix(matrix);
        Main55.chengeHalfRow(matrix);
    }

    static void chengeHalfRow(int[][] matrix) {
        int count = matrix.length / 2, digit = 0;
        for (int i = 0; i < matrix.length / 2; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                digit = matrix[i][j];
                matrix[i][j] = matrix[count][j];
                matrix[count][j] = digit;
            }
            if (count < matrix.length-1) {
                count++;
            }
        }
        System.out.print(Arrays.deepToString(matrix));
    }
}
