package array.multiple;


import java.util.*;

public class Main63 {
    public static void main(String[] args) {
        List<Integer> listA = Arrays.asList(4, 6, 7, 9, 10);
        List<Integer> listB = Arrays.asList(1, 2, 3, 14, 15);
        List<Integer> listC = new ArrayList<>(listA);
        listC.addAll(listB);
        Collections.sort(listC);
        System.out.println(listC);
    }
}