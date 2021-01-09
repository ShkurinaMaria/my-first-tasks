package array.analytics;

public class Main34 {
    public static void main(String[] args) {
        int[][] matrix = Util.generateRandomMatrixEvenAndOdd(9, 5);
        Util.printMatrix(matrix);
        Main34.findDigitEvenInRow(matrix);
    }

    static void findDigitEvenInRow(int[][] matrix) {
        int idxRowLast = 0, count = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] % 2 == 0) {
                    count++;
                }
            }
            if (count == matrix[i].length) {
                idxRowLast = i;
            }
            count =0;
        }
        System.out.println(idxRowLast);
    }
}
