package array.transformation1;

import array.matrix.Util;

public class Main53 {
    public static void main(String[] args) {
        int[][] matrix = Util.generateRandomMatrixNegAndPos(2, 2);
        Util.printMatrix(matrix);
        Util.printMatrix(Main53.changeColumns(matrix, 2));
    }

    static int[][] changeColumns(int[][] matrix, int columns) {
        int idxColumn = -1;
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
                Util.swapInMatrix(i, 0, i, idxColumn);
            }
        }
        return matrix;
    }
}
