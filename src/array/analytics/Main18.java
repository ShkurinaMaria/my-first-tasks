package array.analytics;

public class Main18 {
    public static void main(String[] args) {
        int[][] matrix = Util.generateRandomMatrix(5, 3);
        Util.printMatrix(matrix);
        Main18.printAction(matrix, 2);
    }

    static void printAction(int[][] matrix, int k) {
        int sum = 0, mult = 1;
        for (int i = 0; i < matrix.length; i++) {
            sum += matrix[i][k];
            mult *= matrix[i][k];
        }
        System.out.print("Сумма = " + sum + "  " + "Произведение = " + mult);
    }
}