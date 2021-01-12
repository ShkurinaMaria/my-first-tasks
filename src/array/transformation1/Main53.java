package array.transformation1;

import array.matrix.Util;

import java.util.Arrays;

public class Main53 {
    public static void main(String[] args) {
        int[][] matrix = Util.generateRandomMatrixNegAndPos(4, 7);
        Util.printMatrix(matrix);
        Main53.chengeColumns(matrix, 7);
    }

    static void chengeColumns(int[][] matrix, int columns) {
        int count = 0, idxColumn = 0, digit = 0;
        for (int j = 1; j < columns; j++) {
            for (int i = 0; i < matrix.length; i++) {
                if (matrix[i][j] > 0) {
                    count++;
                }
            }
            if (count == matrix.length) {
                idxColumn = j;
            }
        }
        for (int i = 0; i < matrix.length; i++) {
            digit = matrix[i][0];
            matrix[i][0] = matrix[i][idxColumn];
            matrix[i][idxColumn] = digit;
        }
        System.out.println(Arrays.deepToString(matrix));
    }
}
