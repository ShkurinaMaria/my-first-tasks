package array.matrix;

public class Main15 {
    public static void main(String[] args) {
        int[][] matrix = Util.generateRandomMatrix(5, 5);
        Util.printMatrix(matrix);
        Main15.printSpiral(matrix);
    }

    static void printSpiral(int[][] matrix) {
        int count = 0;
        for (int v = 0; v < (matrix.length + 1) / 2; v++) {

            count++;
        }
        for (int j = matrix.length-4-1; j < matrix.length; j++) {
            System.out.print(matrix[matrix.length-4-1][j]+" ");
        }
        System.out.println();
        for (int i = matrix.length-3-1; i <matrix.length; i++) {
            System.out.print(matrix[i][matrix.length-1]+" ");
        }
        System.out.println();
        for (int j = matrix.length-1-1; j >= 0; j--) {
            System.out.print(matrix[matrix.length-1][j]+" ");
        }
        System.out.println();
        for (int i = matrix.length-1-1; i > 0; i--) {
            System.out.print(matrix[i][matrix.length-4-1]+" ");
        }
        System.out.println();
        for (int j = matrix.length-3-1; j < matrix.length-1; j++) {
            System.out.print(matrix[matrix.length-3-1][j]+" ");
        }
        System.out.println();
        for (int i = matrix.length-2-1; i <=  matrix.length-2; i++) {
            System.out.print(matrix[i][ matrix.length-2]+" ");
        }
        System.out.println();

        for (int j = matrix.length-2-1; j >= matrix.length-4; j--) {
            System.out.print(matrix[matrix.length-2][j]+" ");
        }
        System.out.println();
        for (int i = matrix.length-2-1; i >= matrix.length - 3; i--) {
            System.out.print(matrix[i][matrix.length-4]+" ");
        }
        System.out.println();
        for (int i = matrix.length-2-1; i >= matrix.length - 3; i--) {
            System.out.print(matrix[i][matrix.length-3]+" ");
        }
        System.out.println();
    }
}



