package ru.job4j.tracker;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class SortByNameItemDescTest {
    @Test
    public void whenCheckSort() {
        List<Item> items = new ArrayList<Item>();
        items.add(new Item("Рас", "1"));
        items.add(new Item("Два", "2"));
        items.add(new Item("Три", "3"));
        items.add(new Item("Четыре", "4"));
        items.add(new Item("Пять", "5"));

        items.sort(new SortByNameItemDesc());

        assertThat(items.get(0).getName(), is("Четыре"));

    }
}
