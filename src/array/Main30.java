package array;

public class Main30 {
    public static void main(String[] args) {
        int[] arr = {5, 8, 7, 4, 7, 6};
        int idx = 0;
        int count = 0;
        for (int j = 0; j < arr.length - 1; j++) {
            if (arr[j] > arr[j + 1]) {
                count++;
                idx = j;
                System.out.print(idx + " ");
            }
        }
        System.out.println("Количество = " + count);
    }
}
