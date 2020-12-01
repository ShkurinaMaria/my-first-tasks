package array;

public class Main20 {
    public static void main(String[] args) {
        int[] arr = {9, 2, 3, 4, 5, 6, 9, 8, 9, 1};
        int k = 2, l = 3, sum = 0;
        for (int i = k; i <= l; i++) {
            sum += arr[i];
        }
        System.out.println(sum);
    }
}
