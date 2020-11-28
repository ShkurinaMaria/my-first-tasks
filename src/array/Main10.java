package array;

import java.util.Arrays;

public class Main10 {
    public static void main(String[] args) {
        int[] arr = generateArr(8);
        print(arr);
    }

    static int[] generateArr(int n) {
        int[] arr = new int[n];
        for (int i = 0, j = 0; i < n / 2; i++, j += 2) {
            arr[i] = j;
        }
        for (int i = n / 2, j = n - 1; i < n; i++, j -= 2) {
            arr[i] = j;
        }
        return arr;
    }

    static void print(int[] arr) {
        for (int j : arr) {
            System.out.print(j + " ");
        }
    }
}

