package array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main51 {
    public static void main(String[] args) {
        List<Integer> arrA = Arrays.asList(2, 2, 2, 2);
        List<Integer> arrB = Arrays.asList(27, 42, 67, 6);
        List<Integer> result = new ArrayList<>(arrA);
        arrA = arrB;
        arrB = result;
        System.out.println(arrA);
        System.out.println(result);
    }
}
