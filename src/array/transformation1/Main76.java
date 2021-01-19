package array.transformation1;

import array.matrix.Util;

import java.util.*;

public class Main76 {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> arr = Util.generateRandomArrayList(5, 5);
        Util.printArrayList(arr);
        arr.sort(Comparator.comparingInt(o -> o.get(0)));
        Util.printArrayList(arr);
    }
}