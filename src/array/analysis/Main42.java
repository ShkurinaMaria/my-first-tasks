package array.analysis;

public class Main42 {
    public static void main(String[] args) {
        int[] arr = {4, 32, 3, 4, 43, 2, 32};
        int r = 40;
        int minDiff = Math.abs(r - (arr[0] + arr[1]));
        int first = 0;
        int second = 0;
        for (int j = 0; j < arr.length - 1; j++) {
            int abs = Math.abs(r - (arr[j] + arr[j + 1]));
            if (abs <= minDiff) {
                minDiff = abs;
                first = arr[j];
                second = arr[j + 1];
            }
        }
        System.out.println(first + " " + second);
    }
}
