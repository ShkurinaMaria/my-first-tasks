package array.matrix;

public class Util {
    static int[][] generateMatrixWithDigit(int rows, int columns, int digit) {
        int[][] matrix = new int[rows][columns];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                matrix[i][j] = digit;
            }
        }
        return matrix;
    }
    static int[] generateArr(int count) {
        int[] arr = new int[count];

        for (int i = 0; i < count; i++) {
            arr[i] = i;
        }
        return arr;
    }

    static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + "  ");
            }
            System.out.println();
        }
        System.out.println();
    }
    static int[][] generateRandomMatrix(int rows, int columns) {
        int[][] matrix = new int[rows][columns];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                matrix[i][j] = (int) (Math.random() * 10);
            }
        }
        return matrix;
    }
}
