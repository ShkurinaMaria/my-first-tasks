package Masha;

public class Main {
    public static void main(String[] args) {
        ArrayUtil utils = new ArrayUtil();
        utils.printArray(new int[]{1, 8, 9});
        utils.printReverseArray(new int[]{0, 0, 8, 9});

        int[] sortedArray = utils.sortArray(new int[]{1, 9, 2}, SortType.ASC);
        utils.printArray(sortedArray);
    }
}

