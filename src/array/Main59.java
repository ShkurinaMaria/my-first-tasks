package array;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main59 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(4, 6, 4, 4);
        List<Integer> list1 = new ArrayList<>();
        int aver = 0;
        for (int i = 0; i < list.size(); i++) {
            aver += list.get(i);
            list1.add(aver / (i + 1));
        }
        System.out.println(list1);
    }
}