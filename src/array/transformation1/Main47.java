package array.transformation1;
import array.matrix.Util;
import java.util.Arrays;

public class Main47 {
    public static void main(String[] args) {
        int[][] matrix = Util.generateRandomMatrix(4, 4);
        Util.printMatrix(matrix);
        Main47.changeRow(matrix, 1, 2);
    }

    static void changeRow(int[][] matrix, int k1, int k2) {
        int digit = 0;
            for (int j = 0; j < matrix.length; j++) {
                digit = matrix[k2][j];
                matrix[k2][j] = matrix[k1][j];
                matrix[k1][j] = digit;
        }
        System.out.println(Arrays.deepToString(matrix));
    }
}
