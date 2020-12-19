package array.matrix;

public class Main3 {
    public static void main(String[] args) {
        int[][] matrix = Main3.generateMatrix(5, 6);
        Util.printMatrix(matrix);
    }

    static int[][] generateMatrix(int rows, int columns) {
        int[] arr = Util.generateArr(rows);
        int[][] matrix = new int[rows][columns];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                matrix[i][j] = arr[i];
            }
        }
        return matrix;
    }
}

