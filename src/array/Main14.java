package array;

public class Main14 {
    public static void main(String[] args) {
        int[] arr = generateArr(10);
        print(arr);
    }

    static int[] generateArr(int n) {
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = i + 4;
        }
        return arr;
    }

    static void print(int[] arr) {
        for (int j = 0; j < arr.length; j += 2) {
            System.out.print(arr[j] + " ");
        }
        for (int i = 1; i < arr.length; i += 2) {
            System.out.print(arr[i] + " ");
        }
    }
}
