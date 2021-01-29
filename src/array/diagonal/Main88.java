package array.diagonal;

import array.matrix.Util;

import java.net.URI;
import java.util.Arrays;

public class Main88 {
    public static void main(String[] args) {
        int[][] matrix = Util.generateRandomSquareMatrix(4);
        Util.printMatrix(matrix);
        Util.printMatrix(zeroBelowDiagonal(matrix));
    }

    static int[][] zeroBelowDiagonal(int[][] matrix) {
        int[][] arr = new int[matrix.length][matrix.length];
        int r = 0;
        int t = matrix.length - 1;
        for (int v = 0; v < matrix.length * 2 - 1; v++) {
            for (int i = 0, j = matrix.length - 1 - r; i <= r && j >= t; i++, j++) {
                if (v < matrix.length) {
                    arr[i][j] = matrix[i][j];
                } else {
                    arr[j][i] = 0;
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
        return arr;
    }
}