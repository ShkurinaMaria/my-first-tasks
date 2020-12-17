package array.alteration;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main114 {
    public static void main(String[] args) {
        List<Integer> arr = Arrays.asList(10, 9, 8, 7, 6, 11);
        int count =0;
        for (int i = 0; i < arr.size() - 1; i++) {
            for (int j = 1; j <= i+1; j++) {
                if (arr.get(i) > arr.get(j)){
                    int digit = arr.get(j);
                    arr.set(j,arr.get(i));
                    arr.set(i,digit);
                }
            }
        }
        System.out.print(arr);
    }
}
