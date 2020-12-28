package array.analytics;

public class Main22 {
    public static void main(String[] args) {
        int[][] matrix = Util.generateRandomMatrix(2, 4);
        Util.printMatrix(matrix);
        Main22.printAction(matrix, 4);
    }

    static void printAction(int[][] matrix, int columns) {
        int sum = 0;
        for (int j = 0; j < columns; j += 2) {
            for (int i = 0; i < matrix.length; i++) {
                sum += matrix[i][j];
            }
            System.out.println("Сумма = " + sum);
            sum = 0;
        }
    }
}