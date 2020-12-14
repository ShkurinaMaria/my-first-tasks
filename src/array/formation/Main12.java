package array.formation;

public class Main12 {
    public static void main(String[] args) {
        int[] arr = generateArr(10);
        print(arr);
    }

    static int[] generateArr(int n) {
        if (n % 2 != 0) {
            throw new Error("Количество элементов массива должно быть четным");
        }
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = i + 5;
        }
        return arr;
    }

    static void print(int[] arr) {
        for (int j = 0; j < arr.length; j += 2) {
            System.out.print(arr[j] + " ");
        }
    }
}

