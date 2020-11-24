package minmax;

public class Main19 {
    public static void main(String[] args) {
        int[] arr = {0, 0, 1, 0};
        int min = arr[0];
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            } else if (arr[i] <= min) {
                count++;
            }
        }
        System.out.println("Количество минимальным элементов = " + count);
    }
}
