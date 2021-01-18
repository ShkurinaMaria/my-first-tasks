package array.transformation1;

import array.matrix.Util;

public class Main70 {
    public static void main(String[] args) {
        int[][] matrix = Util.generateRandomMatrix(4, 7);
        Util.printMatrix(matrix);
        Util.printMatrix(Main70.copyRowinMaxDigit(matrix));
    }

    static int[][] copyRowinMaxDigit(int[][] matrix) {
        int[][] arr = new int[matrix.length + 1][matrix[0].length];
        int max = Integer.MIN_VALUE, imax = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (max < matrix[i][j]) {
                    imax = i;
                    max = matrix[i][j];
                }
            }
        }
        System.out.print("максимальный элемент :" + max + " ");
        System.out.println();

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (i < imax) {
                    arr[i][j] = matrix[i][j];
                }
                if (i == imax) {
                    arr[i][j] = matrix[i][j];
                    arr[i + 1][j] = matrix[i][j];
                }
                if (i > imax + 1) {
                    arr[i][j] = matrix[i - 1][j];
                }
            }
        }
        return arr;
    }
}
