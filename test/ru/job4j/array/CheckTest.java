package ru.job4j.array;

import org.junit.Test;
import ru.job4j.array.Check;

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