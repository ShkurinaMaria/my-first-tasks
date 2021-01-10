package array.transformation1;

import array.matrix.Util;

public class Main61 {

    public static void main(String[] args) {
        int[][] matrix = Util.generateRandomMatrix(4, 6);
        Util.printMatrix(matrix);
        Util.printMatrix(Main61.removeRow(matrix, 0));
    }

    static int[][] removeRow(int[][] matrix, int k) {
        int[][] arr = new int[matrix.length - 1][matrix[0].length];
        int m = 0;
        for (int i = 0; i < matrix.length; i++) {
            if (i != k) {
                arr[m] = matrix[i];
                m++;
            }
        }
        return arr;
    }
}
