package array;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class CheckTest {

    @Test
    public void whenArrayElementsEquals() {
        var data = new boolean[] {true, true, true};
        boolean result = Check.mono(data);
        assertTrue(result);
    }

    @Test
    public void whenArrayElementsNotEquals() {
        var data = new boolean[] {true, false, true};
        boolean result = Check.mono(data);
        assertFalse(result);
    }
}