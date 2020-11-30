package array;

public class Main16 {
    public static void main(String[] args) {
        int[] arr = generateArr(5);
        print(arr);
    }

    static int[] generateArr(int n) {
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = i + 8;
        }
        return arr;
    }

    static void print(int[] arr) {
        for (int i = 0, j = arr.length - 1; i < arr.length; i++, j--) {
            System.out.print(arr[i] + " " + arr[j] + " ");
        }
    }
}
