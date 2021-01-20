package array.transformation;

import java.util.*;

public class Main75 {
    public static void main(String[] args) {
        List<Integer> arr = Arrays.asList(31, 9, 2, 12, -101, 8);
        int idxMax = arr.indexOf(Collections.max(arr));
        int idxMin = arr.indexOf(Collections.min(arr));
        List<Integer> beforeMaxMin = idxMax > idxMin ? arr.subList(idxMin, idxMax + 1) : arr.subList(idxMax, idxMin + 1);
        Collections.reverse(beforeMaxMin);
        System.out.println(arr);
    }
}