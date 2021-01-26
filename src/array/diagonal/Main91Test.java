package array.diagonal;

import org.junit.Test;

import static org.junit.Assert.*;

public class Main91Test {

    @Test
    public void zeroBelowDiagonal() {
        int[][] arr = {
                {1, 2},
                {3, 4}
        };
        int[][] expected = {
                {0, 0},
                {3, 0}
        };

        assertArrayEquals(expected, Main91.zeroBelowDiagonal(arr));
    }

    @Test
    public void zeroBelowDiagonal2() {
        int[][] arr = {{1}};
        int[][] expected = {{0}};

        assertArrayEquals(expected, Main91.zeroBelowDiagonal(arr));
    }

    @Test
    public void zeroBelowDiagonal3() {
        int[][] arr = {
                {1, 2, -1},
                {3, -10, 5},
                {3, 4, 1}
        };
        int[][] expected = {
                {0, 0, 0},
                {3, 0, 0},
                {3, 4, 0}
        };

        assertArrayEquals(expected, Main91.zeroBelowDiagonal(arr));
    }
}