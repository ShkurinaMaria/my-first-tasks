package array.diagonal;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class Main84Test {

    @Test
    public void avgDigitDiagonal() {
        int [][] arr = {
                { 1, 2 },
                { 3, 4 }
        };
        float [] expected = { 2.0f, 2.5f, 3.0f };

        assertEquals(Arrays.toString(expected), Arrays.toString(Main84.avgDigitDiagonal(arr)));
    }

    @Test
    public void avgDigitDiagonal2() {
        int [][] arr = { { 1 } };
        float [] expected = { 1f };

        assertEquals(Arrays.toString(expected), Arrays.toString(Main84.avgDigitDiagonal(arr)));
    }

    @Test
    public void avgDigitDiagonal3() {
        int [][] arr = {
                { 1, 2, -1 },
                { 3, -10, 0 },
                { 3, 4, 1 }
        };
        float [] expected = { -1f, 1.0f, -2.6666667f, 3.5f, 3.0f };

        assertEquals(Arrays.toString(expected), Arrays.toString(Main84.avgDigitDiagonal(arr)));
    }
}