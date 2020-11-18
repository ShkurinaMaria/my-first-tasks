package tasks1.series;

public class Main39 {
    public static void main(String[] args) {
        int[][] arr = new int[][]{
                {8, 4, 9, 3, 10},
                {8, 4, 9, 3, 10},
                {8, 4, 9, 3, 10},
                {8, 4, 9, 3, 1},

        };
        System.out.println(comp1(arr));
    }

    static int comp1(int[][] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            boolean flag = true;
            for (int j = 1; j < arr[i].length - 1; j++) {
                boolean firstCondition = arr[i][j - 1] > arr[i][j] && arr[i][j] > arr[i][j + 1];
                boolean secondCondition = arr[i][j - 1] < arr[i][j] && arr[i][j] < arr[i][j + 1];
                if (firstCondition || secondCondition) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                count++;
            }
        }
        return count;
    }

}

