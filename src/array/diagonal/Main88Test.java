package array.diagonal;

import array.matrix.Util;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class Main88Test {

    @Test
    public void zeroBelowDiagonal() {
        int[][] arr = {
                {1, 2},
                {3, 4}
        };
        int[][] expected = {
                {1, 2},
                {0, 4}
        };

        assertEquals(Arrays.toString(expected), Arrays.toString(Main88.zeroBelowDiagonal(arr)));
    }

    @Test
    public void zeroBelowDiagonal2() {
        int[][] arr = {{1}};
        int[][] expected = {{1}};

        assertEquals(Arrays.toString(expected), Arrays.toString(Main88.zeroBelowDiagonal(arr)));
    }

    @Test
    public void zeroBelowDiagonal3() {
        int[][] arr = {
                {1, 2, -1},
                {3, -10, 5},
                {3, 4, 1}
        };
        int[][] expected = {
                {1, 2, -1},
                {0, -10, 5},
                {0, 0, 1}
        };

        assertEquals(Arrays.toString(expected), Arrays.toString(Main88.zeroBelowDiagonal(arr)));
    }
}