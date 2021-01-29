package array.diagonal;

import org.junit.Test;

import static org.junit.Assert.*;

public class Main99Test {

    @Test
    public void mirrorDigitDiagonal() {
        int[][] arr = {
                {1, 2},
                {3, 4}
        };
        int[][] expected = {
                {2, 4},
                {1, 3}
        };

        assertArrayEquals(expected, Main99.mirrorDigitDiagonal(arr));
    }

    @Test
    public void mirrorDigitDiagonal2() {
        int[][] arr = {{1}};
        int[][] expected = {{1}};

        assertArrayEquals(expected, Main99.mirrorDigitDiagonal(arr));
    }

    @Test
    public void mirrorDigitDiagonal3() {
        int[][] arr = {
                {1, 5, 1},
                {2, 6, 3},
                {3, 4, 7}
        };
        int[][] expected = {
                {1, 3, 7},
                {5, 6, 4},
                {1, 2, 3}
        };

        assertArrayEquals(expected, Main99.mirrorDigitDiagonal(arr));
    }

    @Test
    public void mirrorDigitDiagonal5() {
        int[][] arr = {
                {1, 5, 1, 5},
                {2, 6, 3, 6},
                {3, 4, 7, 3},
                {3, 4, 7, 3}

        };
        int[][] expected = {
                {5, 6, 3, 3},
                {1, 3, 7, 7},
                {5, 6, 4, 4},
                {1, 2, 3, 3}
        };

        assertArrayEquals(expected, Main99.mirrorDigitDiagonal(arr));
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
                {3, 6, 3, 1, 4},
                {7, 4, 8, 4, 5},
                {4, 4, 1, 1, 1},
                {6, 8, 5, 3, 4},
                {1, 2, 7, 5, 9},
        };

        assertArrayEquals(expected, Main99.mirrorDigitDiagonal(arr));
    }
}