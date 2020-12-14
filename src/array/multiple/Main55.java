package array.multiple;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main55 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(5, 8, 9, 4, 2, 4, 4, 5, 9, 9, 9, 9, 9);
        List<Integer> evenList = new ArrayList<>();
        for (int i = 1; i < list.size(); i += 2) {
            evenList.add(list.get(i));
        }
        System.out.print(evenList + " " + evenList.size());
    }
}
