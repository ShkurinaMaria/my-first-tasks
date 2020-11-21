package minmax;

public class Main7 {
    public static void main(String[] args) {
        int[] arr = {4, 2, 88, 88, 9, 20, 23, 2};
        int min = arr[0];
        int max = arr[0];
        int idxMax = arr[0];
        int idxMin = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] <= min) {
                min = arr[i];
                idxMin = i;
            }
            if (arr[i] > max) {
                max = arr[i];
                idxMax = i;
            }

        }
        System.out.println("Последнее минимальное число имеет индекс = " + idxMin);
        System.out.println("Первое максимальное число имеет индекс  = " + idxMax);
    }
}
