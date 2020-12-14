package array.formation;

public class Main7 {
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
        for (int j = arr.length - 1; j >= 0; j--) {
            System.out.print(arr[j] + " ");
        }
    }
}


