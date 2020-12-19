package array.matrix;

public class Main6 {
    public static void main(String[] args) {
        int[][] matrix = Main6.generateMatrix(5, 6, 4);
        Util.printMatrix(matrix);
    }

    static int[][] generateMatrix(int rows, int columns, int digit) {
        int[] arr = Util.generateArr(columns);
        int[][] matrix = new int[rows][columns];
        for (int i = 0; i < rows - 1; i++) {
            for (int j = 0; j < columns; j++) {
                matrix[0][j] = arr[j];
                matrix[i + 1][j] = matrix[i][j] * digit;
            }
        }
        return matrix;
    }
}

