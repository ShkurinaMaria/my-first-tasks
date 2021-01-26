package array.diagonal;

import org.junit.Test;

import static org.junit.Assert.*;

public class Main90Test {

    @Test
    public void zeroAboveDiagonal() {
        int[][] arr = {
                {1, 2},
                {3, 4}
        };
        int[][] expected = {
                {1, 0},
                {0, 0}
        };

        assertArrayEquals(expected, Main90.zeroAboveDiagonal(arr));
    }

    @Test
    public void zeroAboveDiagonal2() {
        int[][] arr = {{1}};
        int[][] expected = {{0}};

        assertArrayEquals(expected, Main90.zeroAboveDiagonal(arr));
    }

    @Test
    public void zeroAboveDiagonal3() {
        int[][] arr = {
                {1, 2, -1},
                {3, -10, 5},
                {3, 4, 1}
        };
        int[][] expected = {
                {1, 2, 0},
                {3, 0, 0},
                {0, 0, 0}
        };

        assertArrayEquals(expected, Main90.zeroAboveDiagonal(arr));
    }
}