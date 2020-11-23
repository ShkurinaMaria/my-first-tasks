package minmax;

public class Main9 {
    public static void main(String[] args) {
        int[] arr = {5, 7, 8, 2, 44, 2, 44};
        int max = arr[0];
        int max2 = arr[0];
        int idxMax = arr[0];
        int  idxMax1 = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
                idxMax = i;
            }
            if (arr[i] >= max2) {
                max2 = arr[i];
                idxMax1 = i;
            }
        }
        if (idxMax1 == idxMax) {
            System.out.println("Индекс первого и последнего максимального числа = " + idxMax1);
        } else {
            System.out.println("Первое  и последнее максимальных число " + idxMax + " и " + idxMax1);
        }
    }
}
