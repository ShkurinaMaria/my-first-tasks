package minmax;

public class Main10 {
    public static void main(String[] args) {
        int[] arr = {5, 6, 138, 6, 7, 3, 138};
        int max = arr[0];
        int min = arr[0];
        int idxMax = arr[0];
        int idxMin = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
                idxMax = i;
            }
            if (arr[i] < min) {
                min = arr[i];
                idxMin = i;
            }
        }
        if (idxMax < idxMin) {
            System.out.println("Индекс первого экстремального числа (максимальное) = " + idxMax);
        } else {
            System.out.println("Индекс первого экстремального числа (минимальное) = " + idxMin);
        }
    }
}
