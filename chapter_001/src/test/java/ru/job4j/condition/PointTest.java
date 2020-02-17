package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {

    @Test
    public void distance() {
        Point a = new Point(0, 0);
        Point b = new Point(3, 4);
        double out = a.distance(b);
        Assert.assertEquals(5, out, 0.01);
    }

}
