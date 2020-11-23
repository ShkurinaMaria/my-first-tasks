package minmax;

public class Main13 {
    public static void main(String[] args) {
        int[] arr = {-8, 6, 6, 6, 12, 2, 10};
        int idxMax = arr[0];
        boolean flag = false;
        for (int i = 0; i < arr.length-1; i++) {
            if (arr[i] % 2 != 0 && arr[i] >= arr[i +1]) {
                idxMax = i;
                flag = true;
            }
            if (!flag){
                idxMax = 0;
            }
        }

        System.out.println("Индекс  первого максимального нечетного числа = " + idxMax);
    }
}
