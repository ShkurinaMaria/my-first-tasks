package array.transformation1;

import array.matrix.Util;

import java.util.*;

public class Main78 {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> arr = Util.generateRandomArrayList(5, 8);
        Util.printArrayList(arr);
        for (int i = 0; i < arr.size(); i++) {
            Collections.sort(arr.get(i));
        }
        Util.printArrayList(arr);
    }
}