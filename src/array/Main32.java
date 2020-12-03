package array;

public class Main32 {
    public static void main(String[] args) {
        int[] arr = {5, 9, 9, 9, 7, 6};
        int idx = 0;
        for (int j = 1; j < arr.length - 1; j++) {
            if (arr[j] < arr[j + 1] && arr[j] < arr[j - 1]) {
                idx = j;
                break;
            }
        }
        System.out.println("Номер локального минимума = " + idx);
    }
}


