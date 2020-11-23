package minmax;

public class Main14 {
    public static void main(String[] args) {
        int[] arr = {-99};
        int b = -2;
        int max = Integer.MAX_VALUE;
        int idx = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > b && max > arr[i]) {
                max = arr[i];
                idx = i;
            }
        }
        if (max == Integer.MAX_VALUE) {
            System.out.println("0 0");
        } else {
            System.out.println("Минимальное число, которое больше " + b + " = " + max);
            System.out.println("Индекс минимально числа = " + idx);
        }
    }
}

