package minmax;

public class Main14 {
    public static void main(String[] args) {
        int[] arr = {2, 3, 1, 5, 9,};
        int b = 4;
        int max = arr[0];
        int idx = arr[0];

        for (int i = 0; i < arr.length - 1; i++) {
            if (Math.abs(arr[i] - b) < Math.abs(arr[i + 1] - b)) {
                max = arr[i];
                idx = i;
            } else {
                max = 0;
                idx = 0;
            }
        }
        System.out.println("Минимальное число, которое больше " + b + "=" + max);
        System.out.println("Индекс минимально числа" + idx);
    }
}

