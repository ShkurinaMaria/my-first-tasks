package minmax;

public class Main20 {
    public static void main(String[] args) {
        int[] arr = {-17, 6, 18, 18, -14, 8, -14, -17, -17, -19};
        int max = arr[0];
        int min = arr[0];
        int count = 0;
        int count1 = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
                count = 1;
            } else if (arr[i] >= max) {
                count++;
            }
            if (arr[i] < min) {
                min = arr[i];
                count1 = 1;
            } else if (arr[i] <= min) {
                count1++;
            }
        }
        System.out.println("Количество максимальных экстремумов  = " + count);
        System.out.println("Количество минимальных экстремумов = " + count1);
    }
}

