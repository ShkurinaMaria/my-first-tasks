package array.matrix;

public class Main4 {
    public static void main(String[] args) {
        int[][] matrix = Main4.generateMatrix(5, 6);
        Util.printMatrix(matrix);
    }

    static int[][] generateMatrix(int rows, int columns) {
        int[] arr = Util.generateArr(columns);
        int[][] matrix = new int[rows][columns];
        for (int i = 0; i < rows; i++) {
            if (columns >= 0) System.arraycopy(arr, 0, matrix[i], 0, columns);
        }
        return matrix;
    }
}

