package array;

public class Main28 {
    public static void main(String[] args) {
        int[] arr = {-5, 5, 9, 0, 9};
        int min = 0;
        for (int j = 0; j < arr.length; j += 2) {
            if (arr[j] < min) {
                min = arr[j];
            }
        }
        System.out.println(min);
    }
}
