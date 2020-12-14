package array.multiple;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main54 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(4, 2, 4, 4, 5);
        List<Integer> evenList = list.stream()
                .filter(i -> i % 2 == 0)
                .collect(Collectors.toList());
        System.out.println(evenList.size() + " " + evenList);
    }
}
