package array.transformation1;

import array.matrix.Util;

public class Main64 {

    public static void main(String[] args) {
        int[][] matrix = Util.generateRandomMatrix(4, 6);
        Util.printMatrix(matrix);
        Util.printMatrix(Main64.removeColumnMax(matrix));
    }

    static int[][] removeColumnMax(int[][] matrix) {
        int[][] arr = new int[matrix.length][matrix[0].length - 1];
        int max = Integer.MIN_VALUE;
        int idxColumnMax = 0;
        for (int r = 0; r < matrix[0].length; r++) {
            for (int v = 0; v < matrix.length; v++) {
                if (matrix[v][r] > max) {
                    max = matrix[v][r];
                    idxColumnMax = r;
                }
            }
        }
        for (int j = 0; j < matrix[0].length - 1; j++) {
            for (int i = 0; i < matrix.length; i++) {
                if (j < idxColumnMax) {
                    arr[i][j] = matrix[i][j];
                } else {
                    arr[i][j] = matrix[i][j + 1];
                }
            }
        }
        return arr;
    }
}
