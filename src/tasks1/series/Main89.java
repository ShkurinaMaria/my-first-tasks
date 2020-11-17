package tasks1.series;

import java.util.Arrays;

public class Main89 {
    public static void main(String[] args) {
        Nabor nabor1 = new Nabor(20);
        nabor1.characteristic();
        System.out.println(Arrays.toString(nabor1.getNotEven()));
        System.out.println(Arrays.toString(nabor1.getEven()));
    }
}

class Nabor {
    private int[] arr;
    int[] even = {};
    int[] notEven = {};

    public Nabor(int n) {
        arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = (int) (15 + (Math.random() * (21 - 15)));
        }
        System.out.println(Arrays.toString(arr));
    }

    public int[] getArr() {
        return this.arr;
    }

    void characteristic() {
        for (int j : arr) {
            if (j % 2 == 0) {
                even = Arrays.copyOf(even, even.length + 1);
                even[even.length - 1] = j;
            } else {
                notEven = Arrays.copyOf(notEven, notEven.length + 1);
                notEven[notEven.length - 1] = j;
            }
        }
    }

    public int[] getEven() {
        return this.even;
    }

    public int[] getNotEven() {
        return this.notEven;
    }
}