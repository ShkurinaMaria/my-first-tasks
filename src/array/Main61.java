package array;


import java.util.*;

public class Main61 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(5, 5, 5, 20);
        List<Integer> list1 = new ArrayList<>();
        int aver = 0;
        for (int i = list.size() - 1; i >= 0; i--) {
            aver += list.get(i);
            list1.add(aver / (list.size() - i));
        }
        Collections.reverse(list1);
        System.out.println(list1);
    }
}
