package array.transformation1;

import array.matrix.Util;

import java.util.ArrayList;

public class Main61 {

    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> arr = Util.generateRandomArrayList(4, 6);
        Util.printArrayList(arr);
        Util.printArrayList(Main61.removeRow(arr, 3));
    }


    static ArrayList<ArrayList<Integer>> removeRow(ArrayList<ArrayList<Integer>> arr, int k) {
        arr.remove(k);
        return arr;
    }
}
