package tasks1.series;

public class Main23 {
    public static void main(String[] args) {
        Side2 side2 = new Side2(new int[]{2, 6,4,5,4,5});
        side2.comp();
        System.out.println(side2.getResult());
    }
}

class Side2 {
    int[] arr = {};
    int result = 0;

    public Side2(int[] arr) {
        this.arr = arr;
    }

    void comp() {
        int i = 0;
        boolean isPila = (arr[i] == arr[i + 1]);
        if (!isPila) {
            for (int j = 1; j < arr.length - 1; j++) {
                if (arr[j] > arr[j - 1] && arr[j] > arr[j + 1] || arr[j] < arr[j - 1] && arr[j] < arr[j + 1]) {
                    result += 0;
                } else {
                    result = arr[j];
                }
            }
        } else {
            result = 1;
        }
    }

    public int getResult() {
        return result;
    }
}
