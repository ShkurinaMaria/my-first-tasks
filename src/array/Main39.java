package array;

public class Main39 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 5, 1, 2, 5, 1, 2, 5};
        int count = 0;
        if (arr[arr.length - 2] > arr[arr.length - 1] || arr[arr.length - 2] < arr[arr.length - 1]) {
            count++;
        }
        for (int i = 0; i < arr.length - 2; i++) {
            if ( arr[i] < arr[i + 1] || arr[i] > arr[i + 1]) {
                if (arr[i+1] == arr[i+2] || arr[i+1] < arr[i+2] || arr[i+1] > arr[i+2]){
                    count++;
                }

            }

        }
        System.out.println(count);
    }
}
// не работает