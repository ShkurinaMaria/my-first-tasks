package array;

public class Main15 {
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
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 != 0) {
                System.out.print(arr[i] + " ");
            }
        }
        System.out.println();
        for (int j = arr.length - 1; j >= 0; j--) {
            if (j % 2 == 0)
                System.out.print(arr[j] + " ");
        }
    }
}
