package ru.job4j.loop;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class CheckPrimeNumberTest {
    @Test
    public void when121() {
        boolean rsl = CheckPrimeNumber.check(121);
        assertThat(rsl, is(false));
    }

    @Test
    public void when17() {
        boolean rsl = CheckPrimeNumber.check(17);
        assertThat(rsl, is(true));
    }

    @Test
    public void when16() {
        boolean rsl = CheckPrimeNumber.check(16);
        assertThat(rsl, is(false));
    }

    @Test
    public void when11() {
        boolean rsl = CheckPrimeNumber.check(11);
        assertThat(rsl, is(true));
    }

    @Test
    public void when9() {
        boolean rsl = CheckPrimeNumber.check(9);
        assertThat(rsl, is(false));
    }

    @Test
    public void when5() {
        boolean rsl = CheckPrimeNumber.check(5);
        assertThat(rsl, is(true));
    }

    @Test
    public void when4() {
        boolean rsl = CheckPrimeNumber.check(4);
        assertThat(rsl, is(false));
    }

    @Test
    public void when1() {
        boolean rsl = CheckPrimeNumber.check(1);
        assertThat(rsl, is(true));
    }
}
