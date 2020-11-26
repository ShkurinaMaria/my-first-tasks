package minmax;

public class Main26 {
    public static void main(String[] args) {
        int[] arr = {4, 4, 6, 6, 6, 4, 4, 4, 4, 5, 8, 8};
        int count = 0;
        int max = 0;

        for (int j : arr) {
            count = j % 2 == 0 ? count + 1 : 0;
            if (count > max) {
                max = count;
            }
        }
        System.out.println(max);
    }
}
