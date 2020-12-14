package array.analysis;

public class Main21 {
    public static void main(String[] args) {
        int[] arr = {9, 2, 3, 4, 5, 6, 9, 8, 9, 1};
        int k = 2, l = 3, sum = 0, idx = 0;
        for (int i = k; i <= l; i++) {
            sum += arr[i];
            idx++;
        }
        System.out.println((float) sum / idx);
    }
}
