package minmax;

public class Main8<list> {
    public static void main(String[] args) {
        int[] arr = {1, 4, 1, 4, 7, 4, 2, 5, 1};
        int min = arr[0];
        int min2 = arr[0];
        int idxMin = 0;
        int idxMin2 = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
                idxMin = i;
            }
            if (arr[i] <= min2) {
                min2 = arr[i];
                idxMin2 = i;
            }
        }
        if (idxMin2 == idxMin) {
            System.out.println("Индекс первого и последнего минимального числа = " + idxMin);
        } else {
            System.out.println("Индексы первого и последнего минимальных чисел " + idxMin + " и " + idxMin2);
        }
    }
}
