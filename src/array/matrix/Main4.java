package array.matrix;

import java.util.Arrays;

public class Main4 {
    public static void main(String[] args) {
        int[][] matrix = Util.generateMatrixWithDigit(4, 4, 1);
        Util.printMatrix(matrix);
        System.out.println();
        Main4.modMatrix(matrix);
        Util.printMatrix(matrix);
    }

    static void modMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = j + 1;
            }
        }
    }
}

