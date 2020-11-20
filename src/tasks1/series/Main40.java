package tasks1.series;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Main40 {
    public static void main(String[] args) {
        int[][] arr = new int[][]{
                {8, 4, 9, 3, 8},
                {8, 4, 9, 3, 1},
                {8, 4, 9, 3, 8},
                {8, 4, 9, 3, 8}
        };
        comp1(arr);
    }

    static void comp1(int[][] arr) {
        int idx = 0;
        boolean flag = true;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr[i].length - 1; j++) {
                boolean firstCondition = arr[i][j - 1] > arr[i][j] && arr[i][j] > arr[i][j + 1];
                boolean secondCondition = arr[i][j - 1] < arr[i][j] && arr[i][j] < arr[i][j + 1];
                if (firstCondition || secondCondition) {
                    flag = false;
                    idx = j;
                    break;
                }
            }
            if (flag) {
                System.out.println(arr[i].length);
            } else {
                System.out.println(idx);
            }
            flag = true;
        }
    }
}