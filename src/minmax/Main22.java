package minmax;

public class Main22 {
    public static void main(String[] args) {
        int[] arr = {2, 9, 8, 8, 1, 4};
        int min = arr[0];
        int min1 = arr[1];

        for (int i = 2; i < arr.length; i++) {
            if (arr[i] < min ) {
                min= arr[i];
            }
            if (arr[i] > min && arr[i] < min1) {
                min1= arr[i];
            }


        }
        System.out.print(min + " " + min1);
    }
}


