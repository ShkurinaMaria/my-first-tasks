package array.analytics;

public class Main33 {public static void main(String[] args) {
    int[][] matrix = Util.generateRandomMatrixNegColumns(4, 8);
    Util.printMatrix(matrix);
    Main33.findCountPosAndNeg(matrix,8);
}

    static void findCountPosAndNeg(int[][] matrix, int columns) {
    int countPos = 0, countNeg = 0, idxRow = 0;
        for (int i = columns -1; i >= 0; i--) {
            for (int[] ints : matrix) {
                if (ints[i] > 0) {
                    countPos++;
                }
                if (ints[i] < 0) {
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
