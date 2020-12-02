package array;

import java.util.Arrays;

public class Main24 {
    public static void main(String[] args) {
        int[] arr = generateArr(5);
        System.out.println(Arrays.toString(arr));
        System.out.println(getDiffProgression(arr));
    }

    static int[] generateArr(int n) {
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = i+1;
        }
        return arr;
    }

    static int getDiffProgression(int[] arr) {
        int diff = Math.abs(arr[0] - arr[1]);
        for (int i = 1; i < arr.length - 1; i++) {
            if (Math.abs(arr[i] - arr[i + 1]) == diff) {
                diff = Math.abs(arr[i] - arr[i + 1]);
            } else{
                diff =0;
                break;
            }
        }
        return diff;
    }
}

