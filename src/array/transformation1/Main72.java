package array.transformation1;

import array.matrix.Util;

public class Main72 {
    public static void main(String[] args) {
        int[][] matrix = Util.generateRandomMatrixNegAndPos(3, 5);
        Util.printMatrix(matrix);
        Util.printMatrix(Main72.insertColumnInPositiveDigit(matrix));
    }

    static int[][] insertColumnInPositiveDigit(int[][] matrix) {
        int[][] arr = new int[matrix.length][matrix[0].length + 1];
        int jidx = -1;
        for (int j = matrix[0].length - 1; j >= 0; j--) {
            for (int i = 0; i < matrix.length; i++) {
                if (matrix[i][j] < 0) {
                    break;
                } else if (i == matrix.length - 1) {
                    jidx = j;
                }
            }
        }
        System.out.println(jidx);
        if (jidx >= 0) {
            for (int j = 0; j < arr[0].length; j++) {
                for (int i = 0; i < arr.length; i++) {
                    if (j == 0) {
                        arr[i][j] = 1;
                        arr[i][j + 1] = matrix[i][j];
                    }
                    if (j < jidx) {
                        arr[i][j] = matrix[i][j];
                    }
                    if (j == jidx) {
                        arr[i][j] = 1;
                        arr[i][j + 1] = matrix[i][j];
                    }
                    if (j > jidx + 1) {
                        arr[i][j] = matrix[i][j - 1];
                    }
                }
            }
            return arr;
        } else {
            return matrix;

        }
    }
}
