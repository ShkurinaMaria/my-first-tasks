package minmax;

public class Main18 {
    public static void main(String[] args) {
        int[] arr = {67, 67, 67, 89, 89, 3, 6, 89, 6};
        int max = arr[0];
        int idx = 0;
        int idx1 = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
                idx = i;
            }
            if (arr[i] >= max) {
                max = arr[i];
                idx1 = i;
            }
        }
        if (idx != idx1) {
            System.out.println("Количество элементов, между первм и последним максимальными элементами = " + (idx1 - idx -1));
        } else {
            System.out.println("0");
        }
    }
}
