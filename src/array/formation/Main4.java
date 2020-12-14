package array.formation;

public class Main4 {
    public static void main(String[] args) {
        int[] arr = generateArr(5, 2, 3);
        print(arr);
    }

    static int[] generateArr(int n, int a, int d) {
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = (int) (a * Math.pow(d, i));
        }
        return arr;
    }

    static void print(int[] arr) {
        for (int j : arr) {
            System.out.print(j + " ");
        }
    }
}


