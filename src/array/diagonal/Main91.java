package array.diagonal;

import array.matrix.Util;

import java.util.Arrays;

public class Main91 {
    public static void main(String[] args) {
        int[][] matrix = Util.generateRandomSquareMatrix(4);
        Util.printMatrix(matrix);
        System.out.println(Arrays.toString(zeroBelowDiagonal(matrix)));
    }

    static int[][] zeroBelowDiagonal(int[][] matrix) {
        int[][] arr = new int[matrix.length][matrix.length];
        int r = 0, t = matrix.length - 1;
        for (int v = 0; v < matrix.length * 2 - 1; v++) {
            for (int i = 0, j = matrix.length - 1 - r; i <= r && j >= t; i++, j++) {
                if (v >= matrix.length - 1) {
                    arr[i][j] = 0;
                } else {
                    arr[j][i] = matrix[j][i];
                }
            }
            if (v < matrix.length - 1) {
                t--;
                r++;
            } else {
                t++;
                r--;
            }
        }
        Util.printMatrix(arr);
        return arr;
    }
}