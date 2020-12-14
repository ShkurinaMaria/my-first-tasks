package array.analysis;

public class Main34 {
    public static void main(String[] args) {
        int[] arr = {-5, -4, -9, -2, -7, -6};
        int idx = 0;
        int max = Integer.MIN_VALUE;
        for (int j = 1; j < arr.length - 1; j++) {
            if (arr[j] < arr[j + 1] && arr[j] < arr[j - 1]) {
                if (arr[j] > max) {
                    idx = j;
                    max = arr[j];
                }
            }
        }
        System.out.println("Номер максимального локального минимума = " + idx);
    }
}


