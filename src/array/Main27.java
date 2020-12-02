package array;

public class Main27 {
    public static void main(String[] args) {
        int[] arr = {-1, 2, -9, 2, -3, 4, -5, 5};
        int digit = 0;
        for (int j = 0; j < arr.length - 1; j++) {
            if (arr[j] > 0 && arr[j + 1] < 0 || arr[j] < 0 && arr[j + 1] > 0) {
                digit = 0;
            } else {
                digit = j + 1;
                break;
            }
        }
        System.out.println(digit);
    }
}
