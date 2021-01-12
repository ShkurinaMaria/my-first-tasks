package array.transformation1;

import array.matrix.Util;

import java.util.Arrays;

public class Main57 {
    public static void main(String[] args) {
        int[][] matrix = Util.generateRandomMatrix(4, 6);
        Util.printMatrix(matrix);
        Main57.chengeHalfRow(matrix, 4, 6);
    }

    static void chengeHalfRow(int[][] matrix, int rows, int columns) {
        int countRow = rows / 2, countColumns = columns / 2, digit = 0;
        for (int i = 0; i < rows / 2; i++) {
            for (int j = 0; j < columns / 2; j++) {
                digit = matrix[i][j];
                matrix[i][j] = matrix[countRow][j + countColumns];
                matrix[countRow][j + countColumns] = digit;
            }
            if (countRow < rows - 1) {
                countRow++;
                countColumns = columns / 2;
            }
        }
        System.out.println(Arrays.deepToString(matrix));
    }
}
