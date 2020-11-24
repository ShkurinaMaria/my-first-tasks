package minmax;

public class Main16 {
    public static void main(String[] args) {
        int[] arr = {4, 0, 9, 9, 0, 5, 0};
        int min = arr[0];
        int min1 = arr[0];
        int idx = 0;
        int idx1 = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
                idx = i;
            }
            if (arr[i] <= min1) {
                min1 = min;
                idx1 = idx;
            }
        }
        idx = arr.length - idx1;
        idx1 = arr.length - idx;
        System.out.println("Количество элементов, перед первым минимальным элементом = "+idx1);
    }
}
