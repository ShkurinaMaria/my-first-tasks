package tasks1.series;

import java.awt.*;
import java.awt.desktop.AboutEvent;

public class Main1011 {
    public static void main(String[] args) {
        Сomparison comparison = new Сomparison (new int[]{3, 6, 8, 3, 7, 8});
        System.out.println(comparison.comparison());
        System.out.println(comparison.comparison2());
    }
}

class Сomparison {
    int[] arr = {};
    int k = 30;

    public Сomparison(int[] arr) {
        this.arr = arr;
    }

    boolean comparison() {
        boolean result = false;
        for (int j : arr) {
            if (j > 0) {
                result = true;
            }
        }
        return result;
    }
    boolean comparison2() {
        boolean result = false;
        for (int i = 0; i <arr.length; i++) {
            if (arr[i] < k) {
                result = true;
            }
        }
        return result;
    }
}