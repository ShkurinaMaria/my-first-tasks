package array.analytics;

public class Main32 {
    public static void main(String[] args) {
        int[][] matrix = Util.generateRandomMatrixNeg(4, 8);
        Util.printMatrix(matrix);
        Main32.findCountPosAndNeg(matrix);
    }

    static void findCountPosAndNeg(int[][] matrix) {
        int countPos = 0, countNeg = 0, idxRow = 0;
        for (int i = matrix.length - 1; i >= 0; i--) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] > 0) {
                    countPos++;
                }
                if (matrix[i][j] < 0) {
                    countNeg++;
                }
            }
            if (countNeg == countPos) {
                idxRow = i;
            }
            countNeg = 0;
            countPos = 0;
        }
        System.out.println("Номер строки = " + idxRow);
    }
}