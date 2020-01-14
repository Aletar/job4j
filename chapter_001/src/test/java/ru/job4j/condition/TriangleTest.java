package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class TriangleTest {
    @Test
    public void whenExist() {
        boolean result = Triangle.exist(2.0, 2.0, 2.0);
        assertThat(result, is(true));
    }
    @Test
    public void whenNotExist1() {
        boolean result = Triangle.exist(1.0, 5.0, 2.0);
        assertThat(result, is(false));
    }
    @Test
    public void whenNotExist2() {
        boolean result = Triangle.exist(2.0, 2.0, 4.0);
        assertThat(result, is(false));
    }
}
