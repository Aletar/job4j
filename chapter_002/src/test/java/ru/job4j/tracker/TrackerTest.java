package ru.job4j.tracker;

import org.junit.Test;

import java.util.List;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class TrackerTest {
    @Test
    public void whenAddNewItemThenTrackerHasSameItem() {
        Tracker tracker = new Tracker();
        Item item = new Item("test1");
        tracker.add(item);
        Item result = tracker.findById(item.getId());
        assertThat(result.getName(), is(item.getName()));
    }

    @Test
    public void whenAddTwoItemsTest2ThenCountItemsByNameTest2Is2() {
        Tracker tracker = new Tracker();
        Item item = new Item("test1");
        tracker.add(item);
        item = new Item("test2");
        tracker.add(item);
        item = new Item("test3");
        tracker.add(item);
        item = new Item("test2");
        tracker.add(item);

        List<Item> itemsByName = tracker.findByName("test2");
        assertThat(itemsByName.size(), is(2));
    }
}
