package minmax;

public class Main12 {
    public static void main(String[] args) {
        int[] arr = {-9, 5, -1, -8, 6, 10, 8, 9, -4, 1};
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > min) {
                min = arr[i];
            }
        }
        if (min > 0) {
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] < min && arr[i] > 0) {
                    min = arr[i];
                }
            }
        } else {
            min = 0;
        }
        System.out.println("Минимальное положительно число = " + min);
    }
}
