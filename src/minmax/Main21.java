package minmax;

public class Main21 {
    public static void main(String[] args) {
        int[] arr = {2, 2, 8, 1, 9, 4};
        int min = arr[0];
        int max = arr[0];
        float sred = 0;
        for (int j : arr) {
            if (j <= min) {
                min = j;
            }
            if (j >= max) {
                max = j;
            }
            sred += j;
        }
        sred = (sred - min - max) / (arr.length - 2);
        System.out.println(sred);
    }
}
