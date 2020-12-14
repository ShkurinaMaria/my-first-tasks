package array.formation;
public class Main1 {
    public static void main(String[] args) {
        int[] arr = generateOddArr(10);
        print(arr);
    }

    static int[] generateOddArr(int n) {
        int[] arr = new int[n];
        for (int i = 0, j = 1; i < n; i++, j += 2) {
            arr[i] = j;
        }
        return arr;
    }

    static void print(int[] arr) {
        for (int j : arr) {
            System.out.print(j + " ");
        }
    }
}


