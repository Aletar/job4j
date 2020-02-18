package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class MaxTest {
    @Test
    public void whenMax2() {
        int result = Max.max(1, 2);
        assertThat(result, is(2));
    }

    @Test
    public void whenMax4() {
        int result = Max.max(2, 1, 4, 2);
        assertThat(result, is(4));
    }

    @Test
    public void whenMax3() {
        int result = Max.max(2, 3, 1);
        assertThat(result, is(3));
    }
}
