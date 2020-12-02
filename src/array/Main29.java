package array;

public class Main29 {
    public static void main(String[] args) {
        int[] arr = {-5, 5, 9, 9};
        int max = 0;
        for (int j = 1; j < arr.length; j += 2) {
            if (arr[j] > max) {
                max = arr[j];
            }
        }
        System.out.println(max);
    }
}
