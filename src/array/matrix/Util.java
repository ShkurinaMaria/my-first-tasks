package array.matrix;

import java.util.ArrayList;

public class Util {
    static int[][] generateMatrixWithDigit(int rows, int columns, int digit) {
        int[][] matrix = new int[rows][columns];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                matrix[i][j] = digit;
            }
        }
        return matrix;
    }

    static int[] generateArr(int count) {
        int[] arr = new int[count];

        for (int i = 0; i < count; i++) {
            arr[i] = i;
        }
        return arr;
    }

    public static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + "  ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static int[][] generateRandomMatrix(int rows, int columns) {
        int[][] matrix = new int[rows][columns];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                matrix[i][j] = (int) (Math.random() * 100);
            }
        }
        return matrix;
    }

    public static int[][] generateRandomMatrixNegAndPos(int rows, int columns) {
        int min = -15, max = 5;
        int[][] matrix = new int[rows][columns];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                matrix[i][j] = (int) (Math.random() * (max - min)) + min;
            }
        }
        return matrix;
    }

    public static ArrayList<ArrayList<Integer>> generateRandomArrayList(int rows, int columns) {
        ArrayList<ArrayList<Integer>> arr = new ArrayList<>();
        int min = 10, max = 100;
        for (int i = 0; i < rows; i++) {
            ArrayList<Integer> row = new ArrayList<>();
            for (int j = 0; j < columns; j++) {
                row.add((int) (Math.random() * (max - min) + min));
            }
            arr.add(row);
        }
        return arr;
    }

    public static void printArrayList(ArrayList<ArrayList<Integer>> arr) {
        for (int i = 0; i < arr.size(); i++) {
            for (int j = 0; j < arr.get(i).size(); j++) {
                System.out.print(arr.get(i).get(j) + "  ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
