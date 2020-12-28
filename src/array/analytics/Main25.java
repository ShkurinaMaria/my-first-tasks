package array.analytics;

public class Main25 {
    public static void main(String[] args) {
        int[][] matrix = Util.generateRandomMatrix(3, 5);
        Util.printMatrix(matrix);
        Main25.printAction(matrix);
    }
    static void printAction(int[][] matrix) {
        int sum = 0, idxMax = 0;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                sum += matrix[i][j];
            }
            if (sum > max) {
                max = sum;
                idxMax = i;
            }
            sum = 0;
        }
        System.out.println("Сумма = " + max + " Номер строки = " + idxMax);
    }
}