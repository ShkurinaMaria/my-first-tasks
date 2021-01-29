package array.diagonal;

import array.matrix.Util;

import java.util.Arrays;

public class Main85 {
    public static void main(String[] args) {
        int[][] matrix = Util.generateRandomSquareMatrix(4);
        Util.printMatrix(matrix);
        System.out.println(Arrays.toString(avgDigitDiagonal(matrix)));
    }

    static float[] avgDigitDiagonal(int[][] matrix) {
        float[] avg = new float[matrix.length * 2 - 1];
        int r = 0;
        int t = 0;
        int p = 0;
        for (int v = 0; v < matrix.length * 2 - 1; v++) {
            avg[v] = 0;
            int count = 0;
            for (int i = p, j = t; i <= r && j >= 0; i++, j--) {
                avg[v] += matrix[i][j];
                count++;
            }
            avg[v] = avg[v] / count;
            if (v < matrix.length - 1) {
                t++;
                r++;
            } else {
                p++;
            }
        }
        return avg;
    }
}