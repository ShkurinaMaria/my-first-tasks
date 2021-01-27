package array.diagonal;

import org.junit.Test;

import static org.junit.Assert.*;

public class Main96Test {

    @Test
    public void mirrorDigitDiagonal() {
        int[][] arr = {
                {1, 2},
                {3, 4}
        };
        int[][] expected = {
                {1, 3},
                {2, 4}
        };

        assertArrayEquals(expected, Main96.mirrorDigitDiagonal(arr));
    }

    @Test
    public void mirrorDigitDiagonal2() {
        int[][] arr = {{1}};
        int[][] expected = {{1}};

        assertArrayEquals(expected, Main96.mirrorDigitDiagonal(arr));
    }

    @Test
    public void mirrorDigitDiagonal3() {
        int[][] arr = {
                {1, 3, 1},
                {2, 6, 5},
                {3, 4, 1}
        };
        int[][] expected = {
                {1, 2, 3},
                {3, 6, 4},
                {1, 5, 1}
        };

        assertArrayEquals(expected, Main96.mirrorDigitDiagonal(arr));
    }

    @Test
    public void mirrorDigitDiagonal4() {
        int[][] arr = {
                {1, 6, 3, 7, 3},
                {2, 4, 4, 4, 6},
                {1, 5, 1, 8, 3},
                {5, 3, 1, 4, 1},
                {9, 4, 1, 2, 4},

        };
        int[][] expected = {
                {1, 2, 1, 5, 9},
                {6, 4, 5, 3, 4},
                {3, 4, 1, 1, 1},
                {7, 4, 8, 4, 2},
                {3, 6, 3, 1, 4},
        };

        assertArrayEquals(expected, Main96.mirrorDigitDiagonal(arr));
    }
}