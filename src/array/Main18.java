package array;

public class Main18 {
    public static void main(String[] args) {
        int[] arr = {11, 2, 3, 4, 5, 6, 7, 8, 9, 20};
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] < arr[9]) {
                System.out.println(arr[i]);
                break;
            } else {
                System.out.println(" 0 ");
                break;
            }
        }
    }
}
