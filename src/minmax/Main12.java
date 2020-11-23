package minmax;

public class Main12 {
    public static void main(String[] args) {
        int[] arr = {-9, -4, -5, -5, -7, -2, 1, -11};
        int min = Integer.MAX_VALUE;
        for (int j : arr) {
            if (j > 0 && j < min) {
                min = j;
            }
        }
        System.out.println(min == Integer.MAX_VALUE ? "Мнимального положительного числа нет" : "Минимальное положительное число = " + min);
    }
}
