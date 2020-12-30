package array.analytics;

public class Main30 {
    public static void main(String[] args) {
        int[][] matrix = Util.generateRandomMatrix(4, 3);
        Util.printMatrix(matrix);
        Main30.findMaxIsSredArif(matrix, 3);
    }

    static void findMaxIsSredArif(int[][] matrix, int columns) {
        int sum = 0, count = 0, count1 = 0;
        float sredArif = 0;
        for (int j = 0; j < columns; j++) {
            for (int[] ints : matrix) {
                sum += ints[j];
                count++;
            }
            sredArif = (float) sum / count;
            System.out.print(" Среднее = " + sredArif);
            count = 0;
            sum = 0;
            for (int[] ints : matrix) {
                if (sredArif > ints[j]) {
                    count1++;
                }
            }
            System.out.print("  и Количество элементов = " + count1 + ", ");
            count1 = 0;
        }
    }
}