package array.diagonal;

import org.junit.Test;

import static org.junit.Assert.*;

public class Main95Test {

    @Test
    public void zeroDigitDiagonal() {
        int[][] arr = {
                {1, 2},
                {3, 4}
        };
        int[][] expected = {
                {1, 2},
                {0, 0}
        };

        assertArrayEquals(expected, Main95.zeroDigitDiagonal(arr));
    }

    @Test
    public void zeroDigitDiagonal2() {
        int[][] arr = {{1}};
        int[][] expected = {{0}};

        assertArrayEquals(expected, Main95.zeroDigitDiagonal(arr));
    }

    @Test
    public void zeroDigitDiagonal3() {
        int[][] arr = {
                {1, 2, -1},
                {3, -10, 5},
                {3, 4, 1}
        };
        int[][] expected = {
                {1, 2, -1},
                {3, 0, 5},
                {0, 0, 0}
        };

        assertArrayEquals(expected, Main95.zeroDigitDiagonal(arr));
    }

    @Test
    public void zeroDigitDiagonal4() {
        int[][] arr = {
                {1, 2, 1, 4, 4},
                {3, 4, 5, 4, 4},
                {3, 4, 1, 4, 4},
                {3, 4, 1, 4, 4},
                {3, 4, 1, 4, 4},

        };
        int[][] expected = {
                {1, 2, 1, 4, 4},
                {3, 4, 5, 4, 4},
                {3, 4, 0, 4, 4},
                {3, 0, 0, 0, 4},
                {0, 0, 0, 0, 0},
        };

        assertArrayEquals(expected, Main95.zeroDigitDiagonal(arr));
    }
}