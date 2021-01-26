package array.diagonal;

import org.junit.Test;

import static org.junit.Assert.*;

public class Main89Test {

    @Test
    public void zeroAboveDiagonal() {
        int[][] arr = {
                {1, 2},
                {3, 4}
        };
        int[][] expected = {
                {0, 2},
                {3, 4}
        };

        assertArrayEquals(expected, Main89.zeroAboveDiagonal(arr));
    }

    @Test
    public void zeroAboveDiagonal2() {
        int[][] arr = {{1}};
        int[][] expected = {{1}};

        assertArrayEquals(expected, Main89.zeroAboveDiagonal(arr));
    }

    @Test
    public void zeroAboveDiagonal3() {
        int[][] arr = {
                {1, 2, -1},
                {3, -10, 5},
                {3, 4, 1}
        };
        int[][] expected = {
                {0, 0, -1},
                {0, -10, 5},
                {3, 4, 1}
        };

        assertArrayEquals(expected, Main89.zeroAboveDiagonal(arr));
    }
}