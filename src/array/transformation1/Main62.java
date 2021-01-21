package array.transformation1;

import array.matrix.Util;

import java.util.ArrayList;

public class Main62 {

    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> arr = Util.generateRandomArrayList(4, 6);
        Util.printArrayList(arr);
        Util.printArrayList(Main62.removeColumn(arr, 0));
    }

    static ArrayList<ArrayList<Integer>> removeColumn(ArrayList<ArrayList<Integer>> arr, int k) {
        for (int i = 0; i < arr.size(); i++) {
            arr.get(i).remove(k);
        }
        return arr;
    }
}
