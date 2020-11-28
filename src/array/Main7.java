package array;

public class Main7 {
    public static void main(String[] args) {
        int[] arr = generateArr(5);
        print(arr);
    }

    static int[] generateArr(int n) {
        int[] arr = new int[n];
        for (int i = n - 1; i > 0; i--) {
            arr[i] = i;
        }
        return arr;
    }

    static void print(int[] arr) {
        for (int j : arr) {
            System.out.print(j + " ");
        }
    }
}


