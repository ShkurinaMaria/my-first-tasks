package minmax;

public class Main1 {
    public static void main(String[] args) {
        int[] arr = {5, 9, 0, 8, 6, 99};
        int max = arr[0];
        int min = arr[0];

        for (int j : arr) {
            if (j > max) {
                max = j;
            }
            if (j < min) {
                min = j;
            }
        }
        System.out.println(max);
        System.out.println(min);
    }

}
