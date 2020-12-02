package array;

public class Main26 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 9, 2, 3, 4, 5, 5};
        int digit = 0;
        for (int j = 0; j < arr.length - 1; j++) {
            if (arr[j] % 2 != 0 && arr[j + 1] % 2 == 0 || arr[j] % 2 == 0 && arr[j + 1] % 2 != 0) {
                digit = 0;
            } else {
                digit = j + 1;
                break;
            }
        }
        System.out.println(digit);
    }
}
