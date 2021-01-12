package array.transformation1;

import array.matrix.Util;

public class Main62 {

    public static void main(String[] args) {
        int[][] matrix = Util.generateRandomMatrix(6, 5);
        Util.printMatrix(matrix);
        Util.printMatrix(Main62.removeColumn(matrix, 4));
    }

    static int[][] removeColumn(int[][] matrix, int k) {
        int[][] arr = new int[matrix.length][matrix[0].length - 1];
        for (int j = 0; j < matrix[0].length - 1; j++) {
            for (int i = 0; i < matrix.length; i++) {
                arr[i][j] = j < k ? matrix[i][j] : matrix[i][j + 1];
            }
        }
        return arr;
    }

}
