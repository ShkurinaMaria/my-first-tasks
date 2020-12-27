package array.matrix;

public class Main16 {
    public static void main(String[] args) {
        int[][] matrix = Util.generateRandomMatrix(3, 3);
        Util.printMatrix(matrix);
        Main16.printSpiral(matrix);
    }

    static void printSpiral(int[][] matrix) {
        int i;
        int firstColumns = 0, firstRows = 0;
        int lastColumns = matrix.length - 1;
        int lastRow = matrix.length - 1;
        while (lastRow >= firstRows &&
                lastColumns >= firstColumns) {
            for (i = firstRows; i <= lastRow; i++) {
                System.out.print(matrix[i][firstColumns] + "  ");
            }
            firstColumns++;
            for (i = firstColumns; i <= lastColumns; i++) {
                System.out.print(matrix[lastRow][i] + "  ");
            }
            lastRow--;
            for (i = lastRow; i >= firstRows; i--) {
                System.out.print(matrix[i][lastColumns] + "  ");
            }
            lastColumns--;
            for (i = lastColumns; i >= firstColumns; i--) {
                System.out.print(matrix[firstRows][i] + "  ");
            }
            firstRows++;

        }
    }
}


