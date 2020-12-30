package array.analytics;

public class Main29 {
    public static void main(String[] args) {
        int[][] matrix = Util.generateRandomMatrix(3, 5);
        Util.printMatrix(matrix);
        Main29.findDigitMinSredArif(matrix);
    }

    static void findDigitMinSredArif(int[][] matrix) {
        int sum = 0, count = 0, count1 = 0;
        float sredArif = 0;
        for (int[] ints : matrix) {
            for (int anInt : ints) {
                sum += anInt;
                count++;
                sredArif = (float) sum / count;
            }
            for (int anInt : ints) {
                if (anInt < sredArif) {
                    count1++;
                }
            }
            System.out.println("Количество элементов = " + count1 + ", Среднее = " + sredArif);
            sum = 0;
            count = 0;
            count1 = 0;
        }
    }
}