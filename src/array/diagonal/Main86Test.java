package array.diagonal;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class Main86Test {

    @Test
    public void minDigitDiagonal() {
        int [][] arr = {
                { 1, 2 },
                { 3, 4 }
        };
        int [] expected = { 2, 1, 3 };

        assertEquals(Arrays.toString(expected), Arrays.toString(Main86.minDigitDiagonal(arr)));
    }

    @Test
    public void minDigitDiagonal2() {
        int [][] arr = { { 1 } };
        int [] expected = { 1 };

        assertEquals(Arrays.toString(expected), Arrays.toString(Main86.minDigitDiagonal(arr)));
    }

    @Test
    public void minDigitDiagonal3() {
        int [][] arr = {
                { 1, 2, -1 },
                { 3, -10, 0 },
                { 3, 4, 1 }
        };
        int [] expected = { -1, 0, -10, 3, 3 };

        assertEquals(Arrays.toString(expected), Arrays.toString(Main86.minDigitDiagonal(arr)));
    }
}