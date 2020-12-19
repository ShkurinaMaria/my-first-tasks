package array.matrix;

public class Main2 {
    public static void main(String[] args) {
        int[][] matrix = Util.generateMatrixWithDigit(4, 8, 1);
        Util.printMatrix(matrix);
        Main2.modMatrix(matrix);
        Util.printMatrix(matrix);
    }

    static void modMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = j * 5;
            }
        }
    }
}

