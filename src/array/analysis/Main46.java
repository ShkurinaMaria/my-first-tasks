package array.analysis;

public class Main46 {
    public static void main(String[] args) {
        int[] arr = {8, 20,20, 3, 4, 43, 8, 32};
        int r = 40;
        int minDiff = 0;
        int first = 0;
        int second = 0;
        for (int j = 1; j < arr.length - 1; j++) {
            minDiff = Math.abs(r - (arr[j] + arr[j + 1]));
            for (int i = j + 1; i < arr.length - 1; i++) {
                int abs = Math.abs(r - (arr[i] + arr[i + 1]));
                if (abs <= minDiff) {
                    minDiff = abs;
                    first = arr[j];
                    second = arr[j + 1];
                }
            }
        }
        System.out.println(first + " " + second);
    }
}
