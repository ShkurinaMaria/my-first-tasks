package array.transformation1;

import array.matrix.Util;

public class Main54 {
    public static void main(String[] args) {
        int[][] matrix = Util.generateRandomMatrixNegAndPos(2, 2);
        Util.printMatrix(matrix);
        Util.printMatrix(Main54.changeColumnsNeg(matrix, 2));
    }

    static int[][] changeColumnsNeg(int[][] matrix, int columns) {
        int iFirstColumn = -1;
        for (int j = columns - 2; j >= 0; j--) {
            for (int i = 0; i < matrix.length; i++) {
                if (matrix[i][j] >= 0) {
                    break;
                } else if (i == matrix.length - 1) {
                    iFirstColumn = j;
                }
            }
        }
        if (iFirstColumn >= 0) {
            for (int v = 0; v < matrix.length; v++) {
                Util.swapInMatrix(v, iFirstColumn, v, columns - 1);
            }
        }
        return matrix;
    }
}