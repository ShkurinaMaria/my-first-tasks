package array.diagonal;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class Main85Test {

    @Test
    public void avgDigitDiagonal() {
        int[][] arr = {
                {1, 2},
                {3, 4}
        };
        float[] expected = {1, 2.5f, 4};

        assertEquals(Arrays.toString(expected), Arrays.toString(Main85.avgDigitDiagonal(arr)));
    }

    @Test
    public void avgDigitDiagonal2() {
        int[][] arr = {{1}};
        float[] expected = {1};

        assertEquals(Arrays.toString(expected), Arrays.toString(Main85.avgDigitDiagonal(arr)));
    }

    @Test
    public void avgDigitDiagonal3() {
        int[][] arr = {
                {1, 2, -1},
                {3, -10, 0},
                {3, 4, 1}
        };
        float[] expected = {1, 2.5f, -2.6666667f, 2, 1};

        assertEquals(Arrays.toString(expected), Arrays.toString(Main85.avgDigitDiagonal(arr)));
    }
}