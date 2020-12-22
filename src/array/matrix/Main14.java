package array.matrix;

public class Main14 {
    public static void main(String[] args) {
        int[][] matrix = Util.generateRandomMatrix(4, 4);
        Util.printMatrix(matrix);
        Main14.printАngle(matrix);
    }

    static void printАngle(int[][] matrix) {
        int count = 0;
        for (int v = 0; v < matrix.length; v++) {
            int b = matrix.length - v - 1;
            for (int i = count; i < matrix.length; i++) {
                for (int j = count; j <= matrix.length - 1; j++) {
                    if (i == v || j == count) {
                        System.out.print(matrix[i][j] + " ");
                    } else {
                        System.out.print("_ ");
                    }
                }
                System.out.println();
            }
            count++;
            System.out.println();
        }
    }
}


