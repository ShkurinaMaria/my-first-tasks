package array.transformation1;

import array.matrix.Util;

public class Main47 {
    public static void main(String[] args) {
        int[][] matrix = Util.generateRandomMatrix(4, 4);
        Util.printMatrix(matrix);
        Util.printMatrix(Main47.changeRow(matrix, 1, 2));
    }

    static int[][] changeRow(int[][] matrix, int k1, int k2) {
        int temp = 0;
        for (int j = 0; j < matrix.length; j++) {
            temp = matrix[k2][j];
            matrix[k2][j] = matrix[k1][j];
            matrix[k1][j] = temp;
        }
        return matrix;
    }
}
