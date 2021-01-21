package array.diagonal;

import array.matrix.Util;

public class Main82 {
    public static void main(String[] args) {
        int[][] matrix = Util.generateRandomSquareMatrix(4);
        Util.printMatrix(matrix);
        sumDigitDiagonal(matrix);
    }

    static int sumDigitDiagonal(int[][] matrix) {
        int sum = 0, r = 1;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = matrix.length - 1; j > matrix.length-1 - r; j--) {
                sum += matrix[i][j];
            }
            r++;
            System.out.println("Сумма диагонали матрицы = " + sum);
        }
        return sum;
    }
}