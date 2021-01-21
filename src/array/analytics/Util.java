package array.analytics;

import java.util.ArrayList;

public class Util {
    static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + "  ");
            }
            System.out.println();
        }
        System.out.println();
    }

    static int[][] generateRandomMatrix(int rows, int columns) {
        int[][] matrix = new int[rows][columns];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                matrix[i][j] = (int) (Math.random() * 100);
            }
        }
        return matrix;
    }

    static int[][] generateRandomMatrixNeg(int rows, int columns) {
        int[][] matrix = new int[rows][columns];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                if (j % 2 == 0) {
                    matrix[i][j] = (int) (Math.random() * (-10) + 1);
                } else {
                    matrix[i][j] = (int) (Math.random() * 10 + 1);
                }
            }
        }
        return matrix;
    }

    static int[][] generateRandomMatrixNegColumns(int rows, int columns) {
        int[][] matrix = new int[rows][columns];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                if (i % 2 == 0) {
                    matrix[i][j] = (int) (Math.random() * (-10) + 1);
                } else {
                    matrix[i][j] = (int) (Math.random() * 10 + 1);
                }
            }
        }
        return matrix;
    }

    static int[][] generateRandomMatrixEvenAndOdd(int rows, int columns) {
        int[][] matrix = new int[rows][columns];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                if (i % 2 == 0) {
                    matrix[i][j] = i + 2;
                } else {
                    matrix[i][j] = (int) (Math.random() * 10);
                }
            }
        }
        return matrix;
    }
}