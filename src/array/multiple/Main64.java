package array.multiple;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main64 {
    public static void main(String[] args) {
        List<Integer> listA = Arrays.asList(1, 1, 1, 1);
        List<Integer> listB = Arrays.asList(5, 5, 5, 5);
        List<Integer> listC = Arrays.asList(2, 2, 2, 2, 2);
        List<Integer> listD = Stream.concat(listA.stream(), listB.stream())
                .collect(Collectors.toList());
        listD.addAll(listC);
        listD.sort(Collections.reverseOrder());
        System.out.println(listD);
    }
}
