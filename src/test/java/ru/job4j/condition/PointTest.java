package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {
    @Test
    public void when00to02then2() {
        Point a = new Point(0, 0);
        Point b = new Point(0, 2);
        a.distance(b);
        double expected = 2;
        Assert.assertEquals(expected, a.distance(b), 0.01);
    }

    @Test
    public void when13to57then5dot65() {
        Point a = new Point(1, 3);
        Point b = new Point(5, 7);
        a.distance(b);
        double expected = 5.65;
        Assert.assertEquals(expected, a.distance(b), 0.01);
    }

    @Test
    public void when58to79then2dot23() {
        Point a = new Point(5, 8);
        Point b = new Point(7, 9);
        a.distance(b);
        double expected = 2.23;
        Assert.assertEquals(expected, a.distance(b), 0.01);
    }
}
