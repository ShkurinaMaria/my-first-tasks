package tasks1.series;

public class Main39 {
    public static void main(String[] args) {
        int[][] arr = new int[][]{
                {1, 5, 3, 1},
                {1, 5, 3, 1},
                {1, 5, 3, 1},
                {1, 5, 3, 1},
                {1, 5, 3, 1},
        };
        System.out.println(comp1(arr));
    }

    static int comp1(int[][] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            boolean flag = true;
            for (int j = 0; j < arr[i].length -2; j++) {
                boolean firstCondition = arr[i][j + 1] > arr[i][j] && arr[i][j + 1] < arr[i][j + 2];
                boolean secondCondition = arr[i][j + 1] < arr[i][j] && arr[i][j +1] > arr[i][j + 2];
                if (firstCondition || secondCondition) {
                    flag = false;
                    break;
                }
            }
            if (flag){
                count++;
            }
        }
        return count;
    }

}

