package array.matrix;

public class Main10 {
    public static void main(String[] args) {
        int[][] matrix = Util.generateRandomMatrix(5, 8);
        Util.printMatrix(matrix);
        Main10.printRow(matrix);
    }

    static void printRow(int[][] matrix) {
        for (int[] ints : matrix) {
            for (int j = 1; j < ints.length; j += 2) {
                System.out.print(ints[j] + " ");
            }
            System.out.println();
        }
    }
}

