package array;

import java.util.Arrays;

public class Main52 {
    public static void main(String[] args) {
        float[] arr = {1, 10, 10, 1, 1};
        float result[] = new float[arr.length];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 5) {
                result[i] = 2 * arr[i];
            } else {
                result[i] = arr[i] / 2;
            }
        }
        System.out.println(Arrays.toString(result));
    }
}
