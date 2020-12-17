package array.transformation;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main72 {
    public static void main(String[] args) {
        List<Integer> arr = Arrays.asList(9, 9, 1, 2, 3, 4, 9, 9);
        int k = 2, l = 5;
        List<Integer> betweenElem = arr.subList(k, l + 1);
        Collections.reverse(betweenElem);
        System.out.println(arr);
    }
}
