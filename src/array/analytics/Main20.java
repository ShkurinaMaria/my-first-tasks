package array.analytics;

public class Main20 {
    public static void main(String[] args) {
        int[][] matrix = Util.generateRandomMatrix(2, 4);
        Util.printMatrix(matrix);
        Main20.printAction(matrix);
    }

    static void printAction(int[][] matrix) {
        int mult = 1;
        for (int j = 0; j < matrix.length; j++) {
            for (int i = 0; i < matrix.length; i++) {
                mult *= matrix[i][j];
            }
            System.out.println("Произведение = " + mult);
            mult = 1;
        }
    }
}