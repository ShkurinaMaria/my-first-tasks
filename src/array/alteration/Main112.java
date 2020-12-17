package array.alteration;

import java.util.Arrays;
import java.util.List;

public class Main112 {
    public static void main(String[] args) {
        List<Integer> arr = Arrays.asList(10, 9, 8, 7, 6, 11);
        for (int i = 0; i < arr.size(); i++) {
            for (int j = 0; j < arr.size() - 1; j++) {
                if (arr.get(j) > arr.get(j + 1)) {
                    int digit = arr.get(j + 1);
                    arr.set(j + 1, arr.get(j));
                    arr.set(j, digit);
                }
            }
        }
        System.out.println(arr);
    }
}
