package array;

public class Main9 {
    public static void main(String[] args) {
        int[] arr = generateArr(10);
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

        for (int j = arr.length - 1; j > 0; j--) {
            if (arr[j] % 2 == 0) {
                System.out.print(j + " ");
            }

        }
    }
}

