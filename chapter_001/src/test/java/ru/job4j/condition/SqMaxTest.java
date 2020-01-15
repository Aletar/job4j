package ru.job4j.condition;

import org.hamcrest.Matchers;
import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class SqMaxTest {

    @Test
    public void whenFirstMax() {
        SqMax check = new SqMax();
        int result = check.max(4, 1, 2, 1);
        assertThat(result, Matchers.is(4));
    }

    @Test
    public void whenSecondMax() {
        SqMax check = new SqMax();
        int result = check.max(1, 4, 2, 1);
        assertThat(result, Matchers.is(4));
    }

    @Test
    public void whenThirdMax() {
        SqMax check = new SqMax();
        int result = check.max(1, 2, 4, 1);
        assertThat(result, Matchers.is(4));
    }

    @Test
    public void whenForthMax() {
        SqMax check = new SqMax();
        int result = check.max(1, 2, 4, 5);
        assertThat(result, Matchers.is(5));
    }

}
