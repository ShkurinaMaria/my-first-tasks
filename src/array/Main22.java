package array;

public class Main22 {
    public static void main(String[] args) {
        int[] arr = {9, 1, 3, 4, 5, 6, 9, 8, 9, 1};
        int k = 2, l = 8, sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (i < k || i > l) {
                sum += arr[i];
            }
        }
        System.out.print(sum);
    }
}