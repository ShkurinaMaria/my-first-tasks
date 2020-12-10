package array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main51 {
    public static void main(String[] args) {
        List<Integer> arrA = Arrays.asList(2, 2, 2, 2);
        List<Integer> arrB = Arrays.asList(27, 42, 67, 6);
        for (int i = 0; i < arrA.size(); i++) {
            int t = arrA.get(i);
            arrA.set(i, arrB.get(i));
            arrB.set(i, t);
        }
        System.out.println(arrA);
        System.out.println(arrB);
    }
}
