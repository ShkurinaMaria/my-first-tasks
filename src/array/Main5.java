package array;

public class Main5 {
    public static void main(String[] args) {
        int[] arr = generateArr(5, 1, 1);
        print(arr);
    }

    static int[] generateArr(int n, int f1, int f2) {
        int[] arr = new int[n];
        arr[0] = f1;
        arr[1] = f2;
        for (int i = 2; i < n; i++) {
            arr[i] = arr[i - 1] + arr[i - 2];
        }
        return arr;
    }

    static void print(int[] arr) {
        for (int j : arr) {
            System.out.print(j + " ");
        }
    }
}


