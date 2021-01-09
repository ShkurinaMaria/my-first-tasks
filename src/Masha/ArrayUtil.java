package Masha;

public class ArrayUtil {

    void printArray(int[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }

    void printReverseArray(int[] a) {
        int i = a.length;
        while (i > 0) {
            i--;
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }

    int[] sortArray(int[] a, SortType sortType) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                if (a[i] > a[j] && sortType == SortType.DESC) {
                    flip(a, i, j);
                } else if (a[i] < a[j] && sortType == SortType.ASC) {
                    flip(a, i, j);
                }
            }
        }
        return a;
    }

    private void flip(int[] a, int i, int j) {
        int v = a[i];
        a[i] = a[j];
        a[j] = v;
    }
}

