package array;

public class Main8 {
    public static void main(String[] args) {
        int[] arr = generateArr(5);
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
        int count = 0;
        for (int j = 1; j <= arr.length; j += 2) {
            count++;
            System.out.print(j + " ");
        }
        System.out.print("Количество чисел = " + count);
    }
}

