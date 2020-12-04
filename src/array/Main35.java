package array;

public class Main35 {
    public static void main(String[] args) {
        int[] arr = {5, 9, 5, 2, 7, 6, 1, 5, 3};
        int idx = 0;
        int min = Integer.MAX_VALUE;
        for (int j = 1; j < arr.length - 1; j++) {
            if (arr[j] > arr[j + 1] && arr[j] > arr[j - 1]) {
                if (arr[j] < min) {
                    min = arr[j];
                    idx = j;
                }
            }
        }
        System.out.println("Номер минимального локального максимума = " + idx + " ");
    }
}


