package array.transformation1;

import array.matrix.Util;

public class Main65 {

    public static void main(String[] args) {
        int[][] matrix = Util.generateRandomMatrixNegAndPos(4, 7);
        Util.printMatrix(matrix);
        Util.printMatrix(Main65.removeColumnMax(matrix));
    }

    static int[][] removeColumnMax(int[][] matrix) {
        int idxColumnMax = -1;
        for (int r = matrix[0].length - 1; r >= 0; r--) {
            for (int v = 0; v < matrix.length; v++) {
                if (matrix[v][r] < 0) {
                    break;
                } else if (v == matrix.length - 1) {
                    idxColumnMax = r;
                }
            }
        }
        int[][] arr = new int[matrix.length][matrix[0].length - 1];
        if (idxColumnMax >= 0) {
            for (int j = 0; j < matrix[0].length - 1; j++) {
                for (int i = 0; i < matrix.length; i++) {
                    arr[i][j] = j < idxColumnMax ? matrix[i][j] : matrix[i][j + 1];
                }
            }
            return arr;
        }
        return matrix;
    }
}
