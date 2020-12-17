package array.transformation;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main74 {
    public static void main(String[] args) {
        List<Integer> arr = Arrays.asList(3, 32, 2, 1, 4, 8);
        int idxMax = arr.indexOf(Collections.max(arr));
        int idxMin = arr.indexOf(Collections.min(arr));

        for (int i = 0; i < arr.size(); i++) {
            if (idxMax > idxMin && i >= idxMin && i <= idxMax || idxMax < idxMin && i <= idxMin && i >= idxMax) {
                arr.set(i, 0);
            }
        }
        System.out.println(arr);
    }
}
