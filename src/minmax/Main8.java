package minmax;

public class Main8 {
    public static void main(String[] args) {
        int[] arr = {4, 2, 4, 7, 4, 2};
        int min = arr[0];
        int min2 = arr[0];
        int idxMin = arr[0];
        int idxMin2 = arr[0];
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
        System.out.println("Индыксы первого и последнего минимальных чисел " + idxMin + " и " + idxMin2);
    }
}
