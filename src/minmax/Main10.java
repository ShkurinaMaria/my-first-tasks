package minmax;

public class Main10 {
    public static void main(String[] args) {
        int[] arr = {5, 6, 188, 6, 7, 3, -139};
        int max = arr[0];
        int idx = 0;
        for (int i = 0; i < arr.length; i++) {
            if (Math.abs(arr[i]) > max) {
                max = Math.abs(arr[i]);
                idx = i;
            }
        }
        String result = arr[idx] > 0 ? "Индекс максимального экстремума = "  : "Индекс минимального экстремума = ";
        System.out.println( result + idx);
    }
}

