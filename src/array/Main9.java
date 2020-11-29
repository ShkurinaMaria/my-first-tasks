package array;

public class Main9 {
    public static void main(String[] args) {
        int[] arr = generateArr(5);
        print(arr);
    }

    static int[] generateArr(int n) {
        int[] arr = new int[n];
        int count = 0;
        for (int i = n-1, j = 0; i >= 0; i--, j += 2) {
            arr[i] = j;
            count++;
        }
        System.out.print("Количество чисел = " + count + "  Массив ");
        return arr;
    }

    static void print(int[] arr) {
        for (int j : arr) {
            System.out.print(j + " ");
        }
    }
}
