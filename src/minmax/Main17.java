package minmax;

public class Main17 {
    public static void main(String[] args) {
        int[] arr = {43, 5, 7, 1, 4, 8, 7, 3, 4, 58};
        int max = arr[0];
        int idx = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
                idx = i;
            }
        }
        idx = arr.length - idx - 1;
        System.out.println("Количество элементов, после последнего максимального элемента = " + idx);
    }
}
