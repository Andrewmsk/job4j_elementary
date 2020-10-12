package ru.job4j.condition;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class MaxTest {

    @Test
    public void whenMax1To2Then2() {
        int result = Max.max(1, 2);
        assertThat(result, is(2));
    }

    @Test
    public void whenMax2To1Then1() {
        int result = Max.max(2, 1);
        assertThat(result, is(2));
    }

    @Test
    public void whenNoMax2To2Then2() {
        int result = Max.max(2, 2);
        assertThat(result, is(2));
    }

    @Test
    public void whenMax1From3Then1() {
        int result = Max.max(20, 1, 4);
        assertThat(result, is(20));
    }

    @Test
    public void whenMax3From3Then3() {
        int result = Max.max(20, 1, 40);
        assertThat(result, is(40));
    }

    @Test
    public void whenMax3From4Then3() {
        int result = Max.max(20, 1, 40, 5);
        assertThat(result, is(40));
    }

    @Test
    public void whenMax1From4Then1() {
        int result = Max.max(200, 1, 40, 5);
        assertThat(result, is(200));
    }
}