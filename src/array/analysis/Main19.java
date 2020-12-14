package array.analysis;

public class Main19 {
    public static void main(String[] args) {
        int[] arr = {98, 22, 33, 4, 55, 66, 99, 88, 9, 100};
        int idx = 0;
        for (int i = 1; i < arr.length - 1; i++) {
            if (arr[0] < arr[i] && arr[i] < arr[9]) {
                idx = i;
            }
        }
        System.out.println(idx);
    }
}
