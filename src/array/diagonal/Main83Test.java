package array.diagonal;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class Main83Test {

    @Test
    public void sumDigitDiagonal() {
        int[][] arr = {
                {1, 2},
                {3, 4}
        };
        int[] expected = {1, 5, 4};

        assertEquals(Arrays.toString(expected), Arrays.toString(Main83.sumDigitDiagonal(arr)));
    }

    @Test
    public void sumDigitDiagonal2() {
        int[][] arr = {{1}};
        int[] expected = {1};

        assertEquals(Arrays.toString(expected), Arrays.toString(Main83.sumDigitDiagonal(arr)));
    }

    @Test
    public void sumDigitDiagonal3() {
        int[][] arr = {
                {1, 2, -1},
                {3, -10, 0},
                {3, 4, 1}
        };
        int[] expected = {1, 5, -8, 4, 1};

        assertEquals(Arrays.toString(expected), Arrays.toString(Main83.sumDigitDiagonal(arr)));
    }
}