package array.analysis;

public class Main45 {
    public static void main(String[] args) {
        int[] arr = {8, 32, 3, 4, 43, 3, 4, 8, 32};
        int minDiff = Math.abs(arr[0] + arr[1]);
        int idx = 0;
        for (int j = 0; j < arr.length - 1; j++) {
            int abs = Math.abs(arr[j] + arr[j + 1]);
            if (abs <= minDiff) {
                minDiff = abs;
                idx = j;
            }
        }
        System.out.println(idx + " " + (idx + 1));
    }
}
