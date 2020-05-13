package ru.job4j.tracker;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class SortByNameItemTest {
    @Test
    public void whenCheckSort() {
        List<Item> items = new ArrayList<Item>();
        items.add(new Item("Рас", "1"));
        items.add(new Item("Два", "2"));
        items.add(new Item("Три", "3"));

        items.sort(new SortByNameItem());

        assertThat(items.get(0).getName(), is("Два"));

    }
}
