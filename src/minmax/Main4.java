package minmax;

public class Main4 {
    public static void main(String[] args) {
        int[] arr = {4, 6, 8, 10, 9, 20, 23, 2};
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = i;
            }
        }
        System.out.println(min);
    }
}
