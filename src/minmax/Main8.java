package minmax;

public class Main8 {
    public static void main(String[] args) {
        int[] arr = {4, 6, 4, 1, 4, 1};
        int min = arr[0];
        int idxMin = arr[0];
        int idxMin1 = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
                idxMin1 = i;
            }
            if (arr[i] <= min) {
                min = arr[i];
                idxMin = i;
            }
        }
        System.out.println("Первое минимальное число имеет индекс  = " + idxMin1);
        System.out.println("Последнее минимальное число имеет индекс = " + idxMin);
    }
}
