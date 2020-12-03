package array;

public class Main36 {
    public static void main(String[] args) {
        int[] arr = {3, 13, 10, 11, 12, 90};
        int idx = 0;
        int max = arr[0];
        for (int j = 1; j < arr.length - 1; j++) {
            if (arr[j - 1] < arr[j] && arr[j] < arr[j + 1] || arr[j - 1] > arr[j] && arr[j] > arr[j + 1]) {
                idx = j;
                max = Math.max(arr[j], max);
            }
        }
        System.out.println("Номер максимального числа  = " + idx);
    }
}
// не работает