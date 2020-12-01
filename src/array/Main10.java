package array;

public class Main10 {
    public static void main(String[] args) {
        int[] arr = generateArr(9);
        print(arr);
    }

    static int[] generateArr(int n) {
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = i;
        }
        return arr;
    }

    static void print(int[] arr) {
        for (int i = 0; i <= arr.length - 1; i++) {
            if (arr[i] % 2 == 0) {
                System.out.print(arr[i] + " ");
            }
        }
        for (int i = arr.length - 1; i >= 0; i--)
            if (arr[i] % 2 != 0) {
                System.out.print(arr[i] + " ");
            }
    }
}
