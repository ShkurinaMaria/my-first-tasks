package minmax;

public class Main29 {
    public static void main(String[] args) {
        int[] arr = {11, 11, 8, 8, 8, 8, 11, 11, 11, 8, 8};
        int min = arr[0];
        int count = 0;
        int max1 = 0;

        for (int j : arr) {
            if (j < min) {
                min = j;
                count = 0;
            }
            if (j == min) {
                count++;
                if (max1 < count) {
                    max1 = count;
                }
            } else {
                count = 0;
            }
        }
        System.out.println("Максимальное количество минимальных элементов = " + max1);
    }
}