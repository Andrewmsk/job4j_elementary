package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class PointTest {

    @Test
    public void when00To20Then2() {

        int x1 = 0;
        int y1 = 0;
        int x2 = 2;
        int y2 = 0;
        int expected = 2;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when00To20ThenNo3() {

        int x1 = 0;
        int y1 = 0;
        int x2 = 2;
        int y2 = 0;
        int expected = 3;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertNotEquals(expected, out, 0.01);
    }

    @Test
    public void when1010To1510Then5() {

        int x1 = 10;
        int y1 = 10;
        int x2 = 15;
        int y2 = 10;
        int expected = 5;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }
}