package array.analytics;

public class Main21 {
    public static void main(String[] args) {
        int[][] matrix = Util.generateRandomMatrix(10, 5);
        Util.printMatrix(matrix);
        Main21.printAction(matrix);
    }

    static void printAction(int[][] matrix) {
        float sum = 0;
        int count = 0;
        for (int i = 1; i < matrix.length; i += 2) {
            for (int j = 0; j < matrix[i].length; j++) {
                sum += matrix[i][j];
                count++;
            }
            System.out.println("Среднее арифметическое = " + sum / count);
            sum = 0;
            count = 0;
        }
    }
}