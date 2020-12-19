package array.matrix;

public class Main7 {
    public static void main(String[] args) {
        int[][] matrix = Util.generateRandomMatrix(6, 5);
        Util.printMatrix(matrix);
        Main7.printRow(matrix, 2);
    }

    static void printRow(int[][] matrix, int row) {
        for (int j = 0; j < matrix[row].length; j++) {
            System.out.print(matrix[row][j] + " ");
        }
    }
}

