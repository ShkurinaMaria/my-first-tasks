package minmax;

public class Main16 {
    public static void main(String[] args) {
        int[] arr = {-4, 9, 9, -9, 9, 5, 5, 0};
        int min = arr[0];
        int idx = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
                idx = i;
            }
        }
        idx = arr.length - (arr.length - idx);
        System.out.println("Количество элементов, перед первым минимальным элементом = " + idx);
    }
}
