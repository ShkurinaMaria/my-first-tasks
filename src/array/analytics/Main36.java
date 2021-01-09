package array.analytics;

import java.util.Arrays;

public class Main36 {
    public static void main(String[] args) {
        int[][] matrix = Util.generateRandomMatrix(4, 6);
        Util.printMatrix(matrix);
        Main36.findSimilarRow(matrix);
    }

    static void findSimilarRow(int[][] matrix) {
        int[] firstRow = {3, 5, 77, 8, 11, 9};
        int j = 0;
        int idxRow = 0;
        int count = 0;
        Arrays.stream(matrix).count();
    }
}
// не работает