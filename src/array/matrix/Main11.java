package array.matrix;

public class Main11 {
    public static void main(String[] args) {
        int[][] matrix = Util.generateRandomMatrix(6, 8);
        Util.printMatrix(matrix);
        Main11.printReverseEvenRow(matrix);
    }

    static void printReverseEvenRow(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < matrix[i].length; j++) {
                    System.out.print(matrix[i][j] + " ");
                }
            } else {
                for (int j = matrix[i].length - 1; j >= 0; j--) {
                    System.out.print(matrix[i][j] + " ");
                }
            }

            System.out.println();
        }
    }
}

