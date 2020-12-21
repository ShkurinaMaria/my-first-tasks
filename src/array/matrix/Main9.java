package array.matrix;

public class Main9 {
    public static void main(String[] args) {
        int[][] matrix = Util.generateRandomMatrix(6, 8);
        Util.printMatrix(matrix);
        Main9.printEvenRow(matrix);
    }

    static void printEvenRow(int[][] matrix) {
        for (int i = 0; i < matrix.length; i += 2) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}

