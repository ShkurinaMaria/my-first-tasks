package array.analytics;

public class Main26 {
    public static void main(String[] args) {
        int[][] matrix = Util.generateRandomMatrix(2, 4);
        Util.printMatrix(matrix);
        Main26.printMinIsColumns(matrix, 4);
    }

    static void printMinIsColumns(int[][] matrix, int columns) {
        int mult = 1, idxMin = 0;
        int min = Integer.MAX_VALUE;
        for (int j = 0; j < columns; j++) {
            for (int[] ints : matrix) {
                mult *= ints[j];
            }
            if (mult < min) {
                min = mult;
                idxMin = j;
            }
            mult = 1;
        }
        System.out.println("Произведение = " + min + " Номер столбца = " + idxMin);
    }
}