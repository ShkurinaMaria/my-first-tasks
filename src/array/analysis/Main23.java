package array.analysis;

public class Main23 {
    public static void main(String[] args) {
        int[] arr = {9, 1, 3, 4, 5, 6, 9, 8, 9, 2};
        int k = 2, l = 8, sum = 0, count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (i < k || i > l) {
                sum += arr[i];
                count++;
            }
        }
        System.out.print((float) sum / count);
    }
}