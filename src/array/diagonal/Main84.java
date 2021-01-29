package array.diagonal;

import array.matrix.Util;

import java.util.Arrays;

public class Main84 {
    public static void main(String[] args) {
        int[][] matrix = Util.generateRandomSquareMatrix(4);
        Util.printMatrix(matrix);
        System.out.println(Arrays.toString(avgDigitDiagonal(matrix)));
    }

    static float[] avgDigitDiagonal(int[][] matrix) {
        float[] avg = new float[matrix.length * 2 - 1];
        int r = 0;
        int t = matrix.length - 1;
        for (int v = 0; v < matrix.length * 2 - 1; v++) {
            avg[v] = 0;
            int count = 0;
            for (int i = 0, j = matrix.length - 1 - r; i <= r && j >= t; i++, j++) {
                avg[v] += v < matrix.length ? matrix[i][j] : matrix[j][i];
                count = i + 1;
            }
            avg[v] = avg[v] / count;
            if (v < matrix.length - 1) {
                t--;
                r++;
            } else {
                t++;
                r--;
            }
        }
        return avg;
    }
}