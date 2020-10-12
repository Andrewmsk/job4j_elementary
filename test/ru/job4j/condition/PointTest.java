package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class PointTest {

    @Test
    public void when00To20Then2() {

        Point a = new Point(0, 0);
        Point b = new Point (2, 0);
        int expected = 2;
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when00To20ThenNo3() {

        Point a = new Point(0, 0);
        Point b = new Point (2, 0);
        int expected = 3;
        double out = a.distance(b);
        Assert.assertNotEquals(expected, out, 0.01);
    }

    @Test
    public void when1010To1510Then5() {

        Point a = new Point(10, 10);
        Point b = new Point (15, 10);
        int expected = 5;
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when101010To151010Then5() {

        Point a = new Point(10, 10, 10);
        Point b = new Point (15, 10, 10);
        int expected = 5;
        double out = a.distance3d(b);
        Assert.assertEquals(expected, out, 0.01);
    }
}
