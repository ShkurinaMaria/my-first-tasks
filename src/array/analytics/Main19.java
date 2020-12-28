package array.analytics;

public class Main19 {
    public static void main(String[] args) {
        int[][] matrix = Util.generateRandomMatrix(3, 5);
        Util.printMatrix(matrix);
        Main19.printAction(matrix);
    }

    static void printAction(int[][] matrix) {
        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                sum += matrix[i][j];
            }
            System.out.println("Сумма = " + sum);
            sum = 0;
        }
    }
}