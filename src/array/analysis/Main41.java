package array.analysis;

public class Main41 {
    public static void main(String[] args) {
        int[] arr = {130, 2, 33, 4, 43, 87, 3};
        int sum = arr[0] + arr[1];
        int first = 0;
        int second = 0;
        for (int j = 0; j < arr.length - 1; j++) {
            int sum1 = arr[j] + arr[j + 1];
            if (sum1 >= sum) {
                sum = sum1;
                first = arr[j];
                second = arr[j + 1];

            }
        }
        System.out.println(first + " " + second);
    }
}

