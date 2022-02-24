package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {
    @Test
    public void when002to024then2dot82() {
        Point a = new Point(0, 0, 2);
        Point b = new Point(0, 2, 4);
        a.distance3d(b);
        double expected = 2.82;
        Assert.assertEquals(expected, a.distance3d(b), 0.01);
    }

    @Test
    public void when132to575then6dot40() {
        Point a = new Point(1, 3, 2);
        Point b = new Point(5, 7, 5);
        a.distance3d(b);
        double expected = 6.40;
        Assert.assertEquals(expected, a.distance3d(b), 0.01);
    }

    @Test
    public void when584to791then3dot74() {
        Point a = new Point(5, 8, 4);
        Point b = new Point(7, 9, 1);
        a.distance3d(b);
        double expected = 3.74;
        Assert.assertEquals(expected, a.distance3d(b), 0.01);
    }
}
