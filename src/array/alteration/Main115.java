package array.alteration;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main115 {
    public static void main(String[] args) {
        List<Integer> arr = Arrays.asList(10, 9, 8, 7);
        List<Integer> additional = new ArrayList<>();
        List<Integer> arr1 = arr;
        for (int i = 0; i < arr.size(); i++) {
            additional.add(i);
        }
        for (int i = 0; i < arr.size(); i++) {
            for (int j = 0; j < arr.size() - 1; j++) {
                if (arr.get(j) > arr.get(j + 1)) {
                    int digit = arr1.get(j + 1);
                    arr1.set(j + 1, arr1.get(j));
                    arr1.set(j, digit);
                    int digit1 = additional.get(j + 1);
                    additional.set(j + 1, additional.get(j));
                    additional.set(j, digit1);
                }
            }
        }
        System.out.println(additional);
    }
}
