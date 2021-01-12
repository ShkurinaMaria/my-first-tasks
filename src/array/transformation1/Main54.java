package array.transformation1;

import array.matrix.Util;

import java.util.Arrays;

public class Main54 {
    public static void main(String[] args) {
        int[][] matrix = Util.generateRandomMatrixNegAndPos(4, 6);
        Util.printMatrix(matrix);
        Main54.changeColumnsNeg(matrix, 6);
    }

    static void changeColumnsNeg(int[][] matrix, int columns) {
        int count = 0, idxFerstColumn = -1, digit = 0;
        for (int j = columns - 2; j >= 0; j--) {
            for (int i = 0; i < matrix.length; i++) {
                if (matrix[i][j] < 0) {
                    count++;
                }
            }
            if (count == matrix.length) {
                idxFerstColumn = j;
            }
            count = 0;
        }
        if (idxFerstColumn >= 0) {
            for (int v = 0; v < matrix.length; v++) {
                digit = matrix[v][idxFerstColumn];
                matrix[v][idxFerstColumn] = matrix[v][columns - 1];
                matrix[v][columns - 1] = digit;
            }
        }
        System.out.print(Arrays.deepToString(matrix));
    }
}
