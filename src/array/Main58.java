package array;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main58 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(4, 5, 4, 2, 22, 1, 1, 3, 4);
        List<Integer> list1 = new ArrayList<>();
        int sum = 0;
        for (int i = 0; i < list.size(); i++) {
            sum += list.get(i);
            list1.add(sum);
        }
        System.out.println(list1);
    }
}
