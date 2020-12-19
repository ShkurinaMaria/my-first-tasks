package array.alteration;

import java.util.Arrays;
import java.util.List;

public class Main114 {
    public static void main(String[] args) {
        List<Integer> arr = Arrays.asList(10, 9, 8, 7, 6, 11);
        for (int i = 1; i < arr.size(); i++) {
            for (int j = i - 1, count = i; j >= 0; j--) {
                if (arr.get(count) < arr.get(j)) {
                    Main114.swap(arr, count, j);
                    count --;
                }
            }
        }
        System.out.print(arr);
    }

    static void swap(List<Integer> arr, int i, int j) {
        int digit = arr.get(i);
        arr.set(i, arr.get(j));
        arr.set(j, digit);
    }
}
