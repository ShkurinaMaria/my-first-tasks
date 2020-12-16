package array.transformation;

import java.util.Arrays;
import java.util.List;

public class Main69 {
    public static void main(String[] args) {
        List<Integer> arr = Arrays.asList(3, 7, -23, 2, 47, 8);
        for (int i = 0; i < arr.size() - 1; i += 2) {
            int temp = arr.get(i);
            arr.set(i, arr.get(i + 1));
            arr.set(i + 1, temp);
        }
        System.out.println(arr);
    }
}
