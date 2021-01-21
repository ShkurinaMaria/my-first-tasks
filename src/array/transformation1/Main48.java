package array.transformation1;

import array.matrix.Util;

public class Main48 {
    public static void main(String[] args) {
        int[][] matrix = Util.generateRandomMatrix(4, 4);
        Util.printMatrix(matrix);
        Util.printMatrix(Main48.changeColumns(matrix, 1, 2));
    }

    static int[][] changeColumns(int[][] matrix, int k1, int k2) {
        int temp = 0;
        for (int j = 0; j < matrix.length; j++) {
            temp = matrix[j][k2];
            matrix[j][k2] = matrix[j][k1];
            matrix[j][k1] = temp;
        }
        return matrix;
    }
}
