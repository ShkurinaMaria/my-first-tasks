package array.formation;

public class Main17 {
    public static void main(String[] args) {
        int[] arr = generateArr(7);
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
        for (int i = 0; i < arr.length - 1; i += 2) {
            System.out.print(arr[i] + "" + arr[i + 1] + " " + arr[arr.length - i - 1] + "" + arr[arr.length - i - 2] + " ");
        }
        if (arr.length % 2 != 0) {
            System.out.print(arr[arr.length - 1] + " " + arr[0]);
        }
    }
}