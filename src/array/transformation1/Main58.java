package array.transformation1;

import array.matrix.Util;

import java.util.Arrays;

public class Main58 {
    public static void main(String[] args) {
        int[][] matrix = Util.generateRandomMatrix(6, 4);
        Util.printMatrix(matrix);
        Main58.chengeHalfRow(matrix, 6, 4);
    }

    static void chengeHalfRow(int[][] matrix, int rows, int columns) {
        int countRow = 0, countColumns = columns / 2, digit = 0;
        for (int i = rows / 2; i < rows; i++) {
            for (int j = 0; j < columns / 2; j++) {
                digit = matrix[i][j];
                matrix[i][j] = matrix[countRow][j + countColumns];
                matrix[countRow][j + countColumns] = digit;
            }
            if (countRow < rows / 2) {
                countRow++;
                countColumns = columns / 2;
            }
        }
        System.out.println(Arrays.deepToString(matrix));
    }
}
