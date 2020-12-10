package array.two;

import java.util.Arrays;
import java.util.List;

public class Main65 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(5, 4, 10, 10, 4, 6);
        int k = list.get(5);
        System.out.println(Arrays.toString(list.stream().mapToInt(el -> el + k).toArray()));
    }
}
