package minmax;

public class Main25 {
    public static void main(String[] args) {
        int[] arr = {3, 1, 5, 1, 1, 0};
        int mult = 1;
        int idx = 0;
        int idx1 = 0;

        for (int i = 1; i < arr.length - 2; i++) {
            mult = Math.min(arr[i] * arr[i + 1], arr[i + 1] * arr[i + 2]);
            idx = i;
            idx1 = i + 1;
        }
        System.out.println("Минимальное произведение = " + mult + ". Номера элементов = " + idx + "," + idx1);
    }
}
