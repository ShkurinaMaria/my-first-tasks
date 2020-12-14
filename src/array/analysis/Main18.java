package array.analysis;

public class Main18 {
    public static void main(String[] args) {
        int[] arr = {11, 11, 11, 10};
        int digit = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < arr[3]) {
                digit = arr[i];
            }
        }
        System.out.println(digit);
    }
}
