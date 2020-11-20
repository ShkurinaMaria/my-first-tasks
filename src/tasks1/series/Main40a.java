package tasks1.series;

import java.util.SortedMap;

public class Main40a {
    public static void main(String[] args) {
        int[] arr1 = {3, 6, 1, 7, 9};
        int[] arr2 = {6, 6, 1, 7, 3,7,8};
        int[] arr3 = {3, 1, 4, 2, 3};
        int[] arr4 = {34, 66, 2, 56, 8, 2};

        System.out.println(sequence(arr1));
        System.out.println(sequence(arr2));
        System.out.println(sequence(arr3));
        System.out.println(sequence(arr4));
    }

    static int sequence(int[] arr) {
        int k = 0;
        for (int i = 1; i < arr.length - 1; i++) {
            boolean firstCondition = arr[i - 1] > arr[i] && arr[i] < arr[i + 1];
            boolean secondCondition = arr[i - 1] < arr[i] && arr[i] > arr[i + 1];
            if (firstCondition || secondCondition) {
                k = arr.length;
            } else {
                System.out.print("Номер первого элемента, который не является зубчиком = ");
                return i;
            }
        }
        System.out.print("Количество элементов в пилообразной последовательности = ");
        return k;
    }

}
