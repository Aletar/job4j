package ru.job4j.tracker;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.StringJoiner;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class FindItemsByNameActionTest {
    @Test
    public void whenCheckOutput() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        PrintStream def = System.out;
        System.setOut(new PrintStream(out));
        Tracker tracker = new Tracker();
        Item item1 = new Item("fix bug");
        tracker.add(item1);
        Item item2 = new Item("fix error");
        tracker.add(item2);
        Item item3 = new Item("fix bug");
        tracker.add(item3);
        FindItemsByNameAction act = new FindItemsByNameAction();
        act.execute(new StubInput(new String[] {"fix bug"}), tracker);
        String expect = new StringJoiner(System.lineSeparator(), "", System.lineSeparator())
                .add(item1.toString())
                .add(item3.toString())
                .toString();
        assertThat(new String(out.toByteArray()), is(expect));
        System.setOut(def);
    }
}
