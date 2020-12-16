package array.transformation;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main70 {
    public static void main(String[] args) {
        List<Integer> arr = Arrays.asList(3, 32, 2, 2, 4, 8);
        List<Integer> firstPart = arr.subList(0, arr.size() / 2);
        List<Integer> secondPart = arr.subList(arr.size() / 2, arr.size());
        arr = Stream.concat(secondPart.stream(), firstPart.stream()).collect(Collectors.toList());
        System.out.println(arr);
    }
}
