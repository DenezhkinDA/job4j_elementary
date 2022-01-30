package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class TriangleTest {

    @Test
    public void whenExist() {
        double ab = 3;
        double bc = 4;
        double ac = 5;
        boolean result = Triangle.exist(ab, bc, ac);
        Assert.assertTrue(result);
    }

    @Test
    public void whenNotExist() {
        double ab = 1;
        double bc = 2;
        double ac = 3;
        boolean result = Triangle.exist(ab, bc, ac);
        Assert.assertFalse(result);
    }
}
