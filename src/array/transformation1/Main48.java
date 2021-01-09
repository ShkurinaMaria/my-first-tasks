package array.transformation1;

import array.matrix.Util;

import java.util.Arrays;

public class Main48 {
    public static void main(String[] args) {
        int[][] matrix = Util.generateRandomMatrix(4, 4);
        Util.printMatrix(matrix);
        Main48.changeColumns(matrix, 1, 2);
    }

    static void changeColumns(int[][] matrix, int k1, int k2) {
        int digit = 0;
        for (int j = 0; j < matrix.length; j++) {
            digit = matrix[j][k2];
            matrix[j][k2] = matrix[j][k1];
            matrix[j][k1] = digit;
        }
        System.out.println(Arrays.deepToString(matrix));
    }
}
