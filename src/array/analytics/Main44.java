package array.analytics;

public class Main44 {
    public static void main(String[] args) {
        int[][] matrix = Util.generateRandomMatrix(9, 4);
        Util.printMatrix(matrix);
        Main44.rowDigitMin(matrix);
    }

    static void rowDigitMin(int[][] matrix) {
        int count = 0, count1 = 0;
        int max = Integer.MIN_VALUE;
        int min1 = Integer.MAX_VALUE;
        int min2 = Integer.MAX_VALUE;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] > max) {
                    max = matrix[i][j];
                    count++;
                }
            }
            if (count == matrix.length) {
                count1++;
                min1 = matrix[i][0];
            }
            count = 0;
            max = Integer.MIN_VALUE;
        }
        for (int[] ints : matrix) {
            for (int anInt : ints) {
                if (anInt < min1) {
                    min1 = anInt;
                    count++;
                }
            }
            if (count == ints.length) {
                count++;
            }
            count = 0;
            min1 = Integer.MAX_VALUE;
        }


        System.out.println(count1);
    }
}
// не работает