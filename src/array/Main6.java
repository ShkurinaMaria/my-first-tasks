package array;

public class Main6 {
    public static void main(String[] args) {
        int[] arr = generateArr(5, 1, 2);
        print(arr);
    }

    static int[] generateArr(int n, int first, int second) {
        if (n < 2) {
            throw new Error("Количество элементов массива должно быть больше 2");
        }

        int[] arr = new int[n];
        int sum = first + second;
        arr[0] = first;
        arr[1] = second;

        for (int i = 2; i < n; i++) {
            arr[i] = sum;
            sum += sum;
        }
        return arr;
    }

    static void print(int[] arr) {
        for (int j : arr) {
            System.out.print(j + " ");
        }
    }
}


