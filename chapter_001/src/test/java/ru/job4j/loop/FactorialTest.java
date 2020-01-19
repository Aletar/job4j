package ru.job4j.loop;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class FactorialTest {
    @Test
    public void whenCalculateFactorialForZeroThenOne() {
        Factorial factorial = new Factorial();
        int res = factorial.calc(0);
        assertThat(res, is(1));
    }

    @Test
    public void whenCalculateFactorialForOneThenOne() {
        Factorial factorial = new Factorial();
        int res = factorial.calc(1);
        assertThat(res, is(1));
    }

    @Test
    public void whenCalculateFactorialForFiveThenOneHundreedTwenty() {
        Factorial factorial = new Factorial();
        int res = factorial.calc(5);
        assertThat(res, is(120));
    }
}
