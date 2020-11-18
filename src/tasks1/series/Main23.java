package tasks1.series;

public class Main23 {
    public static void main(String[] args) {
        System.out.println(new Side2(new int[]{4, 6, 4}).comp() == 0);
        System.out.println(new Side2(new int[]{6, 4, 6}).comp() == 0);
        System.out.println(new Side2(new int[]{0, 0, 0}).comp() == 1);
        System.out.println(new Side2(new int[]{1, 2, 3}).comp() == 1);
        System.out.println(new Side2(new int[]{4, 6, 4, 3, 5}).comp() == 2);
        System.out.println(new Side2(new int[]{6, 7, 3}).comp() == 0);
    }
}

class Side2 {
    int[] arr = {};

    public Side2(int[] arr) {
        this.arr = arr;
    }

    int comp() {
        if (arr[0] == arr[1]) {
            return 1;
        }
        if (arr[arr.length - 1] == arr[arr.length - 2]) {
            return arr[arr.length - 2];
        }
        for (int j = 1; j < arr.length - 1; j++) {
            boolean firstCondition = arr[j] > arr[j - 1] && arr[j] < arr[j + 1];
            boolean secondCondition = arr[j] < arr[j - 1] && arr[j] > arr[j + 1];
            if (firstCondition || secondCondition) {
                return j;
            }
        }
        return 0;
    }
}
