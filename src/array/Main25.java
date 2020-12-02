package array;

import java.util.Arrays;

public class Main25 {
    public static void main(String[] args) {
        int[] arr = generateArr(5);
        System.out.println(Arrays.toString(arr));
        System.out.println(getDiffProgression(arr));
    }

    static int[] generateArr(int n) {
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = i + 1;
        }
        return arr;
    }

    static float getDiffProgression(int[] arr) {
        float diff = arr[1] / arr[0];
        for (int i = 1; i < arr.length - 1; i++) {
            if (arr[i + 1] / arr[i] == diff) {
                diff = (float) arr[i + 1] / arr[i];
            } else {
                diff = 0;
                break;
            }
        }
        return diff;
    }
}

