package array.analytics;

public class Main42 {
    public static void main(String[] args) {
        int[][] matrix = Util.generateRandomMatrix(9, 4);
        Util.printMatrix(matrix);
        Main42.rowAscenDigit(matrix);
    }

    static void rowAscenDigit(int[][] matrix) {
        int count = 0, count1 = 0;
        int max = Integer.MIN_VALUE;
        for (int[] ints : matrix) {
            for (int anInt : ints) {
                if (anInt > max) {
                    max = anInt;
                    count++;
                }
            }
            if (count == ints.length) {
                count1++;
            }
            count = 0;
            max = Integer.MIN_VALUE;
        }
        System.out.println(count1);
    }
}
