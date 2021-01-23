package array.diagonal;

import org.junit.Test;

import static org.junit.Assert.*;

public class Main82Test {

    @Test
    public void sumDigitDiagonal() {
        int [][] arr = {
                { 1, 2 },
                { 3, 4 }
        };
        int [] expected = { 2, 5, 3 };

        assertEquals(expected, Main82.sumDigitDiagonal(arr));
    }

    @Test
    public void sumDigitDiagonal2() {
        int [][] arr = { { 1 } };
        int [] expected = { 1 };

        assertEquals(expected, Main82.sumDigitDiagonal(arr));
    }

    @Test
    public void sumDigitDiagonal3() {
        int [][] arr = {
                { 1, 2, -1 },
                { 3, -10, 0 },
                { 3, 4, 1 }
        };
        int [] expected = { -1, 2, -8, 7, 3 };

        assertEquals(expected, Main82.sumDigitDiagonal(arr));
    }
}