package array;

public class Main31 {
    public static void main(String[] args) {
        int[] arr = {9, 8, 7, 4, 7, 6};
        int idx = 0;
        int count = 0;
        for (int j = arr.length - 1; j > 0; j--) {
            if (arr[j - 1] > arr[j]) {
                count++;
                idx = j;
                System.out.print(idx + " ");
            }
        }
        System.out.println("Количество = " + count);
    }
}
