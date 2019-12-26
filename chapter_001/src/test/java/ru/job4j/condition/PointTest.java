package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {

    @Test
    public void distance() {
        double out = Point.distance(0, 0, 3, 4);
        Assert.assertEquals(5, out, 0.01);
    }

}
