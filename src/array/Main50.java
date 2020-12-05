package array;

public class Main50 {
    public static void main(String[] args) {
        int[] arr = {10, 9, 8, 7, 6};
        int count = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                count++;
            }
        }
        System.out.println(count);
    }
}
