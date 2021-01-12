package array.transformation1;

import array.matrix.Util;

public class Main63 {

    public static void main(String[] args) {
        int[][] matrix = Util.generateRandomMatrix(6, 3);
        Util.printMatrix(matrix);
        Util.printMatrix(Main63.removeRowMin(matrix));
    }

    static int[][] removeRowMin(int[][] matrix) {
        int[][] arr = new int[matrix.length - 1][matrix[0].length];
        int min = Integer.MAX_VALUE;
        int idxRowMin = 0, m = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] < min) {
                    min = matrix[i][j];
                    idxRowMin = i;
                }
            }
        }
        for (int i = 0; i < matrix.length; i++) {
            if (i != idxRowMin) {
                arr[m] = matrix[i];
                m++;
            }
        }
        return arr;
    }
}
