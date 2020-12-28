package array.analytics;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main23 {
    public static void main(String[] args) {
        int[][] matrix = Util.generateRandomMatrix(3, 5);
        Util.printMatrix(matrix);
        Main23.printMinIsRow(matrix);
    }

    static void printMinIsRow(int[][] matrix) {
        for (int[] ints : matrix) {
            List<Integer> list = Arrays.stream(ints).boxed().collect(Collectors.toList());
            Integer min = list
                    .stream()
                    .mapToInt(v -> v)
                    .min().orElseThrow(NoSuchElementException::new);
            System.out.print(min + "  ");
        }
    }
}