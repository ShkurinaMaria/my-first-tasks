package array.multiple;

import java.util.Arrays;
import java.util.List;

public class Main52 {
    public static void main(String[] args) {
        List<Integer> arr = Arrays.asList(1, 10, 10, 1, 1);
        System.out.println(Arrays.toString(arr.stream().mapToInt(el -> el < 5 ? el * 2 : el / 2).toArray()));
    }
}
