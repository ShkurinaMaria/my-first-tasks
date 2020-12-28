package array.analytics;

public class Main24 {
    public static void main(String[] args) {
        int[][] matrix = Util.generateRandomMatrix(3, 5);
        Util.printMatrix(matrix);
        Main24.printMaxIsColumns(matrix, 5);
    }

    static void printMaxIsColumns(int[][] matrix, int columns) {
        int max = Integer.MIN_VALUE;
        int digit;
        for (int j = 0; j < columns; j++) {
            for (int i = 0; i < matrix.length; i++) {
                digit = matrix[i][j];
                if (digit > max){
                    max = digit;
                }
            }
            System.out.println("Максимальное число в столбце = " + max);
            max = Integer.MIN_VALUE;
        }
    }
}