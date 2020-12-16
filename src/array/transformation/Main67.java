package array.transformation;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main67 {
    public static void main(String[] args) {
        List<Integer> arr = Arrays.asList(3, 3, -23, 23, 47, 8);
        Integer first = arr.stream().filter(x -> x % 2 != 0).findFirst().orElse(0);
        arr = arr
                .stream()
                .map(x -> x % 2 != 0 ? x + first : x)
                .collect(Collectors.toList());
        System.out.println(arr);
    }
}
