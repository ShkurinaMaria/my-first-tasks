package array.transformation;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main75 {
    public static void main(String[] args) {
        List<Integer> arr = Arrays.asList(3, -99, 2, 12, 101, 8);
        int idxMax = arr.indexOf(Collections.max(arr));
        int idxMin = arr.indexOf(Collections.min(arr));

        if (idxMax > idxMin) {
            List<Integer> beforeMaxMin = arr.subList(idxMin + 1, idxMax);
            Collections.reverse(beforeMaxMin);
        } else {
            List<Integer> beforeMaxMin = arr.subList(idxMax + 1, idxMin);
            Collections.reverse(beforeMaxMin);
        }
        System.out.println(arr);
    }
}