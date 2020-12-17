package array.alteration;

import java.util.Arrays;
import java.util.List;

public class Main113 {
    public static void main(String[] args) {
        List<Integer> arr = Arrays.asList(10, 9, 8, 7);
        for (int i = arr.size() - 1; i >= 0; i--) {
            int max = arr.get(i);
            int idx = i;
            for (int j = i - 1; j >= 0; j--) {
                if (arr.get(j) > max) {
                    max = arr.get(j);
                    idx = j;
                }
            }
            int t = arr.get(i);
            arr.set(i, max);
            arr.set(idx, t);
        }
        System.out.println(arr);
    }
}
