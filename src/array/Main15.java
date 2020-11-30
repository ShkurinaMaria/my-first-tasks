package array;

public class Main15 {
    public static void main(String[] args) {
        int[] arr = generateArr(8);
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
        for (int i = 1; i < arr.length; i += 2) {
            System.out.print(arr[i] + " ");
        }
        for (int j = arr.length - 2; j >= 0; j -= 2) {
            System.out.print(arr[j] + " ");
        }
    }
}
