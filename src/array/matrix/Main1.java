package array.matrix;

import java.util.Arrays;

public class Main1 {
    public static void main(String[] args) {
        int matrix [][] = Util.generateMatrixWithDigit(4, 8, 2);
        Util.printMatrix(matrix);
        Main1.modMatrix(matrix);
        Util.printMatrix(matrix);
    }

    static void modMatrix(int [][] matrix){
        for (int i = 0; i < matrix.length; i++) {
            Arrays.fill(matrix[i], i * 10);
        }
    }
}
