package array;


import java.util.*;

public class Main60 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(4, 5, 4, 2);
        List<Integer> list1 = new ArrayList<>();
        int sum = 0;
        for (int i = list.size() - 1; i >= 0; i--) {
            sum += list.get(i);
            list1.add(sum);
        }
        Collections.reverse(list1);
        System.out.println(list1);
    }
}
