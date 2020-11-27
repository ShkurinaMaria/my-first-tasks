package array;

public class Main3 {
    public static void main(String[] args) {
        int[] arr = generateArr(5);
        print(arr);
    }

    static int[] generateArr(int n) {
        int[] arr = new int[n];
        int a = 2;
        int d = 2;
        for (int i = 0, j = 0; i < n; i++, j += 1) {
            arr[i] = a + j * d;
        }
        return arr;
    }

    static void print(int[] arr) {
        for (int j : arr) {
            System.out.print(j + " ");
        }
    }
}


