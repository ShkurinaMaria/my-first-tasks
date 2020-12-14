package array.analysis;

public class Main49 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};
        int idx = 0;
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] < 1 || arr[i] > arr.length) {
                idx = i;
            }
        }
        System.out.println(idx);
    }
}
