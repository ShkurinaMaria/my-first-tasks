package array.analysis;

public class Main48 {
    public static void main(String[] args) {
        int[] arr = {7, 7, 7, 7, 4,4, 4, 3, 3, 5, 6};
        int count = 1;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == arr[i + 1]) {
                count++;
            }
        }

        System.out.println(count);
    }
}
