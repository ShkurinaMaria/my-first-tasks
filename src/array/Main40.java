package array;

public class Main40 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 43, 887, 32};
        int r = 40;
        int minDiff = Math.abs(r - arr[0]);
        int idx = 0;
        for (int j = 1; j < arr.length; j++) {
            int abs = Math.abs(arr[j] - r);
            if (abs < minDiff) {
                minDiff = abs;
                idx = j;
            }
        }
        System.out.println(idx);
    }
}
