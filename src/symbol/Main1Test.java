package symbol;

import array.diagonal.Main82;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class Main1Test {

    @Test
    public void returnCode() {

        char character = 'A';
        int expected = 65;

        assertEquals(expected, Main1.returnCode(character));
    }
    @Test
    public void returnCode1() {

        char character = 'z';
        int expected = 122;

        assertEquals(expected, Main1.returnCode(character));
    }
    @Test
    public void returnCode2() {

        char character = '%';
        int expected = 37;

        assertEquals(expected, Main1.returnCode(character));
    }
}