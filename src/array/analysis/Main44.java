package array.analysis;

public class Main44 {
    public static void main(String[] args) {
        int[] arr = {9, 3, 4, 3, 6, 2};
        int idx1 = 0;
        int idx2 = 0;
        for (int j = 0; j < arr.length; j++) {
            idx1 = j;
            for (int i = j + 1; i < arr.length; i++) {
                idx2 = i;
                if (arr[i] == arr[j]) {
                    System.out.println(idx1 + " " + idx2);
                }
            }
        }
    }
}
