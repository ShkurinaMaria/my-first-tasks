package array;

public class Main5 {
    public static void main(String[] args) {
        int[] arr = generateArr(5);
        print(arr);
    }

    static int[] generateArr(int n) {
        int[] arr = new int[n];
        int f1 = 1;
        int f2 = 1;
        int b = 0;
        for (int i = 0; i < n; i++) {
            b = f1;
            f1 = f2;
            f2 = b + f1;
            arr[i] = f1 + b;
        }
        return arr;
    }

    static void print(int[] arr) {
        for (int j : arr) {
            System.out.print(j + " ");
        }
    }
}


