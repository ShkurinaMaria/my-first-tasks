package array.analytics;

public class Main43 {
    public static void main(String[] args) {
        int[][] matrix = Util.generateRandomMatrix(3, 6);
        Util.printMatrix(matrix);
        Main43.rowDescenDigit(matrix, 6);
    }

    static void rowDescenDigit(int[][] matrix, int columns) {
        int count = 0, count1 = 0;
        int min = Integer.MAX_VALUE;
        for (int j = 0; j < columns; j++) {
            for (int[] ints : matrix) {
                if (ints[j] < min) {
                    min = ints[j];
                    count++;
                }
            }
            if (count == matrix.length) {
                count1++;
            }
            count = 0;
            min = Integer.MAX_VALUE;
        }
        System.out.println(count1);
    }
}
