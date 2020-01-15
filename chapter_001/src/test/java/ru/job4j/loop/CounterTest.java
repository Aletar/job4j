package ru.job4j.loop;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class CounterTest {

    @Test
    public void whenSumEvenNumbersFromOneToTenThenThirty() {

        Counter counter = new Counter();
        int sum = counter.add(1, 10);
        assertThat(sum, is(30));
    }

    @Test
    public void whenSumEvenNumbersFromOneToOne() {

        Counter counter = new Counter();
        int sum = counter.add(1, 1);
        assertThat(sum, is(0));
    }

    @Test
    public void whenSumEvenNumbersFromOneToTwo() {

        Counter counter = new Counter();
        int sum = counter.add(1, 2);
        assertThat(sum, is(2));
    }

}
