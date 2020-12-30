package array.analytics;


public class Main31 {
    public static void main(String[] args) {
        int[][] matrix = Util.generateRandomMatrix(4, 3);
        Util.printMatrix(matrix);
        Main31.finddigitIsSredArif(matrix, 3);
    }

    static void finddigitIsSredArif(int[][] matrix, int columns) {
        int sum = 0, count = 0;
        float sredArif = 0;
        int idxRow = 0;
        int idxColumns = 0;
        float min = Integer.MAX_VALUE;
        for (int j = 0; j < columns; j++) {
            for (int i = 0; i < matrix.length; i++) {
                sum += matrix[i][j];
                count++;
            }
        }
        sredArif = (float) sum / count;
        System.out.println("Среднее арифметическое = " + sredArif);
        for (int j = 0; j < columns; j++) {
            for (int i = 0; i < matrix.length; i++) {
                float diff = Math.abs(matrix[i][j] - sredArif);
                if (diff < min) {
                    min = diff;
                    idxRow = i;
                    idxColumns = j;
                }
            }
        }
        System.out.println("Номер строки = " + idxRow + ", Номер столбца = " + idxColumns);
    }
}