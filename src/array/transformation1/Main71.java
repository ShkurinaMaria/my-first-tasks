package array.transformation1;

import array.matrix.Util;

public class Main71 {
    public static void main(String[] args) {
        int[][] matrix = Util.generateRandomMatrix(3, 5);
        Util.printMatrix(matrix);
        Util.printMatrix(Main71.copyColumnInMinDigit(matrix));
    }

    static int[][] copyColumnInMinDigit(int[][] matrix) {
        int[][] arr = new int[matrix.length][matrix[0].length + 1];
        int min = Integer.MAX_VALUE, jmin = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (min > matrix[i][j]) {
                    jmin = j;
                    min = matrix[i][j];
                }
            }
        }
        System.out.print("максимальный элемент :" + min + " ");
        System.out.println();

        for (int j = 0; j < arr[0].length; j++) {
            for (int i = 0; i < arr.length; i++) {
                if (j < jmin) {
                    arr[i][j] = matrix[i][j];
                }
                if (j == jmin) {
                    arr[i][j] = matrix[i][j];
                    arr[i][j + 1] = matrix[i][j];
                }
                if (j > jmin + 1) {
                    arr[i][j] = matrix[i][j - 1];
                }
            }
        }
        return arr;
    }
}
