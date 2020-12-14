package array.analysis;

public class Main36 {
    public static void main(String[] args) {
        int[] arr = {-1, 1, -2, 3, -3, -8};
        int max = Integer.MIN_VALUE;
        for (int j = 1; j < arr.length - 1; j++) {
            int a = arr[j - 1];
            int b = arr[j];
            int c = arr[j + 1];

            if (!isLocalMin(a, b, c) && !isLocalMax(a, b, c) && b > max) {
                max = b;
            }
        }
        System.out.println("Максимального элемент  = " + (max == Integer.MIN_VALUE ? 0 : max));
    }

    static boolean isLocalMin(int a, int b, int c) {
        return b < a && b < c;
    }

    static boolean isLocalMax(int a, int b, int c) {
        return b > a && b > c;
    }
}
