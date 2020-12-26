package array.matrix;

public class Main15a {
    public static void main(String[] args) {
        int[][] matrix = Util.generateRandomMatrix(6, 6);
        Util.printMatrix(matrix);
        Main15a.printSpiral(matrix);
    }

    static void printSpiral(int[][] matrix) {
        int i;
        int l = 0, k = 0;
        int lastRows = matrix.length - 1;
        int lastColumns = matrix.length - 1;
        while (k <= lastRows &&
                l <= lastColumns) {
            for (i = l; i <= lastColumns; i++) {
                System.out.print(matrix[k][i] + "  ");
            }
            k++;
            System.out.println();
            for (i = k; i <= lastRows; i++) {
                System.out.print(matrix[i][lastColumns] + "  ");
            }
            lastColumns--;
            System.out.println();
            if (k <= lastRows) {
                for (i = lastColumns; i >= l; i--) {
                    System.out.print(matrix[lastRows][i] + "  ");
                }
                lastRows--;
            }
            System.out.println();
            if (l <= lastColumns) {
                for (i = lastRows; i >= k; i--) {
                    System.out.print(matrix[i][l] + "  ");
                }
                l++;
            }
        }
    }
}


