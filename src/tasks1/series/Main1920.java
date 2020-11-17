package tasks1.series;

import java.util.Arrays;

public class Main1920 {
    public static void main(String[] args) {
        Side side = new Side(new int[]{4, 44, 67, 890, 45, 90});
        side.left();
        side.right();
    }
}


class Side {
    int[] arr;

    public Side(int[] arr) {
        this.arr = arr;
    }

    void left() {
        int count = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[i - 1]) {
                System.out.print(arr[i] + "  ");
                count++;
            }
        }
        System.out.println("Количество = " + count);
    }

    void right() {
        int count = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] < arr[i + 1]) {
                System.out.print(arr[i] + "  ");
                count++;
            }
        }
        System.out.println("Количество = " + count);
    }
}