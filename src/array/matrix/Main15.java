package array.matrix;

public class Main15 {
    public static void main(String[] args) {
        int[][] matrix = Util.generateRandomMatrix(6, 6);
        Util.printMatrix(matrix);
        Main15.printSpiral(matrix);
    }

    static void printSpiral(int[][] matrix) {
        int i;
        int firstColumns = 0, firstRow = 0;
        int lastRows = matrix.length - 1;
        int lastColumns = matrix.length - 1;
        while (firstRow <= lastRows &&
                firstColumns <= lastColumns) {
            for (i = firstColumns; i <= lastColumns; i++) {
                System.out.print(matrix[firstRow][i] + "  ");
            }
            firstRow++;
            System.out.println();
            for (i = firstRow; i <= lastRows; i++) {
                System.out.print(matrix[i][lastColumns] + "  ");
            }
            lastColumns--;
            System.out.println();
            for (i = lastColumns; i >= firstColumns; i--) {
                System.out.print(matrix[lastRows][i] + "  ");
            }
            lastRows--;
            System.out.println();
            for (i = lastRows; i >= firstRow; i--) {
                System.out.print(matrix[i][firstColumns] + "  ");
            }
            firstColumns++;
        }
    }
}


