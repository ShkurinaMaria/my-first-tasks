package array.diagonal;

import array.matrix.Util;

public class Main81 {
    public static void main(String[] args) {
        int[][] matrix = Util.generateRandomSquareMatrix(6);
        Util.printMatrix(matrix);
        avgDigitDiagonal(matrix);
    }

    static void avgDigitDiagonal(int[][] matrix) {
        int avg = 0, count = matrix.length;
        for (int i = 0, j = matrix.length - 1; i < matrix.length; i++, j--) {
            avg += matrix[i][j];
        }
        avg = avg / count;
        System.out.println("Среднее арифметическое побочной диагонали матрицы = " + avg);
    }
}