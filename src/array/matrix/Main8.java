package array.matrix;

public class Main8 {
    public static void main(String[] args) {
        int[][] matrix = Util.generateRandomMatrix(6, 5);
        Util.printMatrix(matrix);
        Main8.printColumns(matrix, 2);
    }

    static void printColumns(int[][] matrix, int columns) {
        for (int j = 0; j < matrix.length; j++) {
            System.out.println(matrix[j][columns] + " ");
        }
    }
}

