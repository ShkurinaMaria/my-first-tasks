package array;

public class Main38 {
    public static void main(String[] args) {
        int[] arr = {6, 5, 4, 40, 10, 5, 30, 4, 2, 30, 5, 4};
        int count = 0;
        if (arr[arr.length - 2] > arr[arr.length - 1]) {
            count++;
        }
        for (int i = 0; i < arr.length - 2; i++) {
            if (arr[i] > arr[i + 1]) {
                if (arr[i + 2] >= arr[i + 1]) {
                    count++;
                }
            }

        }
        System.out.println(count);
    }
}
