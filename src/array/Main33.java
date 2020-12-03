package array;

public class Main33 {
    public static void main(String[] args) {
        int[] arr = {5, 1, 9, 1, 7, 6};
        int idx = 0;
        for (int j = 1; j < arr.length - 1; j++) {
            if (arr[j] > arr[j + 1] && arr[j] > arr[j - 1]) {
                idx = j;
            }
        }
        System.out.println("Номер локального максимума = " + idx);
    }
}


