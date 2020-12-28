package array.analytics;

public class Main17 {
    public static void main(String[] args) {
        int[][] matrix = Util.generateRandomMatrix(3, 5);
        Util.printMatrix(matrix);
        Main17.printAction(matrix, 1);
    }

    static void printAction(int[][] matrix, int k) {
        int sum = 0, mult = 1;
        for (int i = 0; i < matrix[k].length; i++) {
            sum += matrix[k][i];
            mult *= matrix[k][i];
        }
        System.out.print("Сумма = " + sum + "  " + "Произведение = " + mult);
    }
}