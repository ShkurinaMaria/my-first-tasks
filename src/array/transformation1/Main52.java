package array.transformation1;

import array.matrix.Util;

import java.util.Arrays;

public class Main52 {
    public static void main(String[] args) {
        int[][] matrix = Util.generateRandomMatrix(4, 7);
        Util.printMatrix(matrix);
        Util.printMatrix(Main52.changeMinAndMaxInColumns(matrix, 4));
    }

    static int[][] changeMinAndMaxInColumns(int[][] matrix, int columns) {
        int idxRowMin = 0, idxRowMax = 0;
        for (int j = 0; j < columns; j++) {
            int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
            for (int[] ints : matrix) {
                if (ints[j] < min) {
                    min = ints[j];
                    idxRowMin = j;
                }
                if (ints[j] > max) {
                    max = ints[j];
                    idxRowMax = j;
                }
            }
        }
        for (int i = 0; i < matrix.length; i++) {
            Util.swapInMatrix(matrix, i, idxRowMax, i, idxRowMin);
        }
        return matrix;
    }
}
