package minmax;

public class Main30 {
    public static void main(String[] args) {
        int[] arr = {1,1,1,1};
        int count = 0;
        int max = arr[0];
        int max1 = 0;

        for (int j : arr) {
            if (j > max) {
                max = j;
                count = 0;
            }
            if (j == max) {
                count++;
                max1 = count;
                if (max1 > count) {
                    max1 = count;
                }
            } else {
                count = 0;
            }
        }
        System.out.println("Минимальное количество максимальных элементов = " + max1);
    }
}