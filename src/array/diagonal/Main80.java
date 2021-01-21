package array.diagonal;

import array.matrix.Util;

public class Main80 {
    public static void main(String[] args) {
        int[][] matrix = Util.generateRandomSquareMatrix(6);
        Util.printMatrix(matrix);
        sumDigitDiagonal(matrix);
    }

    static int sumDigitDiagonal(int[][] matrix) {
        int sum = 0;
        for (int i = 0, j = 0; i < matrix.length; i++, j++) {
            sum += matrix[i][j];
        }
        System.out.println("Сумма диагонали матрицы = " + sum);
        return sum;
    }
}