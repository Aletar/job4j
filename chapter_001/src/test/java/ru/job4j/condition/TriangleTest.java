package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

public class TriangleTest {
    @Test
    public void areaIsSix() {
        Triangle t = new Triangle(new Point(0, 0), new Point(0, 4), new Point(3, 0));
        double result = t.area();
        assertEquals(result, 6, 0.01);
    }

    @Test
    public void areaIsTwelve() {
        Triangle t = new Triangle(new Point(0, 5), new Point(6, 4), new Point(18, 6));
        double result = t.area();
        assertEquals(result, 12, 0.01);
    }
}
