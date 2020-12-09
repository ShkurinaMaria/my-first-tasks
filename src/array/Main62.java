package array;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main62 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(-34, 6, -4, 4);
        List<Integer> listB = new ArrayList<>();
        List<Integer> listC = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) > 0) {
                listB.add(list.get(i));
            } else {
                listC.add(list.get(i));
            }
        }
        System.out.println(listB.size() + " " + listB);
        System.out.println(listC.size() + " " + listC);
    }
}