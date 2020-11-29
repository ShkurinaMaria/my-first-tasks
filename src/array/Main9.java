package array;

public class Main9 {
    public static void main(String[] args) {
        int[] arr = generateArr(10);
        print(arr);
    }

    static int[] generateArr(int n) {
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = i + 3;
        }
        return arr;
    }

    static void print(int[] arr) {
        int count = 0;

        for (int j = arr.length - 1; j >= 0; j--) {
            if (arr[j] % 2 == 0) {
                count++;
                System.out.print(arr[j] + " ");
            }
        }
        System.out.print("Количество = " + count);
    }
}

