package array.transformation1;

import array.matrix.Util;

public class Main53 {
    public static void main(String[] args) {
        int[][] matrix = Util.generateRandomMatrixNegAndPos(4, 7);
        Util.printMatrix(matrix);
        Util.printMatrix(Main53.changeColumns(matrix, 7));
    }

    static int[][] changeColumns(int[][] matrix, int columns) {
        int idxColumn = -1, temp = 0;
        for (int j = 1; j < columns; j++) {
            for (int i = 0; i < matrix.length; i++) {
                if (matrix[i][j] < 0) {
                    break;
                } else if (i == matrix.length - 1) {
                    idxColumn = j;
                }
            }
        }
        if (idxColumn >= 0) {
            for (int i = 0; i < matrix.length; i++) {
                temp = matrix[i][0];
                matrix[i][0] = matrix[i][idxColumn];
                matrix[i][idxColumn] = temp;
            }
        }
        return matrix;
    }
}
