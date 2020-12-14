package array.transformation;

import java.util.*;

public class Main68 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(3, 2, 2, 2, 4, 45, -10);
        int max = Collections.max(list);
        int min = Collections.min(list);
        int temp = min;
        min = max;
        max = temp;
        list.set(list.indexOf(max), min);
        list.set(list.indexOf(min), temp);
        System.out.print(list);
    }
}
