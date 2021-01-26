package array.diagonal;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class Main87Test {

    @Test
    public void maxDigitDiagonal() {
        int[][] arr = {
                {1, 2},
                {3, 4}
        };
        int[] expected = {1, 3, 4};

        assertEquals(Arrays.toString(expected), Arrays.toString(Main87.maxDigitDiagonal(arr)));
    }

    @Test
    public void maxDigitDiagonal2() {
        int[][] arr = {{1}};
        int[] expected = {1};

        assertEquals(Arrays.toString(expected), Arrays.toString(Main87.maxDigitDiagonal(arr)));
    }

    @Test
    public void maxDigitDiagonal3() {
        int[][] arr = {
                {1, 2, -1},
                {3, -10, 0},
                {3, 4, 1}
        };
        int[] expected = {1, 3, 3, 4, 1};

        assertEquals(Arrays.toString(expected), Arrays.toString(Main87.maxDigitDiagonal(arr)));
    }
}