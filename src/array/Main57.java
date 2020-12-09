package array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main57 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(5, 8, 9, 4, 2, 4, 4, 5, 9, 9, 9, 9, 9);
        List<Integer> list1 = new ArrayList<>();
        for (int i = 0; i < list.size(); i += 2) {
            list1.add(list.get(i));
        }
        for (int i = 1; i < list.size(); i += 2) {
            list1.add(list.get(i));
        }
        System.out.print(list1 + " " + list1.size());
    }
}
