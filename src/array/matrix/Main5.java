package array.matrix;

public class Main5 {
    public static void main(String[] args) {
        int[][] matrix = Main5.generateMatrix(5, 6, 4);
        Util.printMatrix(matrix);
    }

    static int[][] generateMatrix(int rows, int columns, int digit) {
        int[] arr = Util.generateArr(rows);
        int[][] matrix = new int[rows][columns];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns - 1; j++) {
                matrix[i][0] = arr[i];
                matrix[i][j + 1] = matrix[i][j] + digit;
            }
        }
        return matrix;
    }
}

