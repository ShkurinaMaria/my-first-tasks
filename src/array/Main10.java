package array;

import java.util.Arrays;

public class Main10 {
    public static void main(String[] args) {
        int[] arr = generateArr(10);
        print(arr);
    }

    static int[] generateArr(int n) {
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = i;
        }
        return arr;
    }

    static void print(int[] arr) {
        for (int j = 0; j < arr.length; j += 2) {
            arr[j] = j;
            System.out.print(arr[j] + " ");
        }
        for (int j = arr.length - 1; j > 0; j -= 2) {
            arr[j] = j;
            System.out.print(arr[j] + " ");
        }
    }
}
