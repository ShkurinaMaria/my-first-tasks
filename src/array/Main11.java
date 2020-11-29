package array;

public class Main11 {
    public static void main(String[] args) {
        int[] arr = generateArr(10);
        print(arr,4);
    }

    static int[] generateArr(int n) {
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = i;
        }
        return arr;
    }

    static void print(int[] arr, int k) {
        int idx = 0;
        for (int i = 0, j = k; j < arr.length; j += k, i++) {
            idx = j;
            System.out.print("Элемент = " + idx + " ");
            System.out.println("Индекс = " + j + " ");
        }
    }
}

