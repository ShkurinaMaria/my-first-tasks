package minmax;

public class Main19 {
    public static void main(String[] args) {
        int[] arr = {-1, -1, 1, 1, -1};
        int min = arr[0];
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
                count = 1;
            } else if (arr[i] == min) {
                count++;
            }
        }
        System.out.println("Количество минимальным элементов = " + count);
    }
}
