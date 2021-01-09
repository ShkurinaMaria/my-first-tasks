package array.transformation1;

import array.matrix.Util;

import java.util.Arrays;

public class Main51 {
    public static void main(String[] args) {
        int[][] matrix = Util.generateRandomMatrix(6, 4);
        Util.printMatrix(matrix);
        Main51.changeMinAndMaxInRow(matrix, 4);
    }

    static void changeMinAndMaxInRow(int[][] matrix, int columns) {
        int digit = 0, idxRowMin = 0, idxRowMax = 0;
        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] < min) {
                    min = matrix[i][j];
                    idxRowMin = i;
                }
                if (matrix[i][j] > max) {
                    max = matrix[i][j];
                    idxRowMax = i;
                }
            }
        }
        for (int i = 0; i < columns; i++) {
            digit = matrix[idxRowMax][i];
            matrix[idxRowMax][i] = matrix[idxRowMin][i];
            matrix[idxRowMin][i] = digit;
        }
        System.out.println(Arrays.deepToString(matrix));
    }
}
