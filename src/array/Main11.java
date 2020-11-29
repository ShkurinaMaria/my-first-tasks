package array;

public class Main11 {
    public static void main(String[] args) {
        int[] arr = generateArr(10);
        print(arr, 2);
    }

    static int[] generateArr(int n) {
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = i + 7;
        }
        return arr;
    }

    static void print(int[] arr, int k) {
        for (int j = 0; j < arr.length; j += k) {
            System.out.print("Элемент = " + arr[j] + " ");
            System.out.println("Индекс = " + j + " ");
        }
    }
}

