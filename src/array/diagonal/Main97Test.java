package array.diagonal;

import org.junit.Test;

import static org.junit.Assert.*;

public class Main97Test {

    @Test
    public void mirrorDigitDiagonal() {
        int[][] arr = {
                {1, 2},
                {3, 4}
        };
        int[][] expected = {
                {4, 2},
                {3, 1}
        };

        assertArrayEquals(expected, Main97.mirrorDigitDiagonal(arr));
    }

    @Test
    public void mirrorDigitDiagonal2() {
        int[][] arr = {{1}};
        int[][] expected = {{1}};

        assertArrayEquals(expected, Main97.mirrorDigitDiagonal(arr));
    }

    @Test
    public void mirrorDigitDiagonal3() {
        int[][] arr = {
                {7, 3, 1},
                {2, 6, 5},
                {3, 4, 1}
        };
        int[][] expected = {
                {1, 5, 1},
                {4, 6, 3},
                {3, 2, 7}
        };

        assertArrayEquals(expected, Main97.mirrorDigitDiagonal(arr));
    }

    @Test
    public void mirrorDigitDiagonal4() {
        int[][] arr = {
                {1, 6, 4, 7, 3},
                {2, 8, 4, 4, 6},
                {7, 5, 1, 8, 3},
                {5, 3, 1, 4, 1},
                {9, 4, 1, 5, 4},

        };
        int[][] expected = {
                {4, 1, 3, 6, 3},
                {5, 4, 8, 4, 7},
                {1, 1, 1, 4, 4},
                {4, 3, 5, 8, 6},
                {9, 5, 7, 2, 1},
        };

        assertArrayEquals(expected, Main97.mirrorDigitDiagonal(arr));
    }
}