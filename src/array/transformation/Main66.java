package array.transformation;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main66 {
    public static void main(String[] args) {
        List<Integer> arr = Arrays.asList(3, 32, 2, 2, 4, 8);
        int first = 0;
        for (int i = arr.size() - 1; i >= 0; i--) {
            if (arr.get(i) % 2 == 0) {
                first = arr.get(i);
            }
        }
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) % 2 == 0) {
                arr.set(i, arr.get(i) + first);
            }
        }
        System.out.println(arr);
    }
}
class Main66_1 {
    public static void main(String[] args) {
        List<Integer> arr = Arrays.asList(3, 32, 2, 2, 4, 8);
        Integer first = arr.stream().filter(x -> x % 2 == 0).findFirst().orElse(0);
        arr = arr
                .stream()
                .map(x -> x % 2 == 0 ? x + first : x)
                .collect(Collectors.toList());

        System.out.println(arr);
    }
}
