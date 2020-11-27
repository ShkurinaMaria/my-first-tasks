package minmax;

public class Main24 {
    public static void main(String[] args) {
        int[] arr = {-1, -5, -10, -15};
        int sum = 0;

        for (int i = 0; i < arr.length - 2; i++) {
            sum = Math.max(arr[i] + arr[i + 1], arr[i + 1] + arr[i + 2]);
        }
        System.out.println(sum);
    }
}
