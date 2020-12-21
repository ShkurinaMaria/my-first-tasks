package array.matrix;

public class Main12 {
    public static void main(String[] args) {
        int[][] matrix = Util.generateRandomMatrix(3, 3);
        Util.printMatrix(matrix);
        Main12.printReverseEvenColumns(matrix);
    }

    static void printReverseEvenColumns(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print((j % 2 == 0 ? matrix[i][j] : matrix[matrix.length - i - 1][j]) + "  ");
            }
            System.out.println();
        }
    }
}

