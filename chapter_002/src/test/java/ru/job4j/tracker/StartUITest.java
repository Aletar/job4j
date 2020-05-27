package ru.job4j.tracker;

import org.junit.Test;

import java.util.List;
import java.util.ArrayList;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class StartUITest {
    @Test
    public void whenAddItem() {
        String[] answers = {"Fix PC"};
        Input input = new StubInput(answers);
        Tracker tracker = new Tracker();
        UserAction action = new CreateAction();
        action.execute(input, tracker);
        Item created = tracker.findAll().get(0);
        Item expected = new Item("Fix PC");
        assertThat(created.getName(), is(expected.getName()));
    }

    @Test
    public void whenReplaceItem() {
        Tracker tracker = new Tracker();
        Item item = new Item("new item");
        tracker.add(item);
        String[] answers = {
                item.getId(), // id сохраненной заявки в объект tracker.
                "replaced item"
        };
        UserAction action = new ReplaceAction();
        action.execute(new StubInput(answers), tracker);
        Item replaced = tracker.findByName("replaced item").get(0);
        assertNotNull(replaced);
    }

    @Test
    public void whenDeleteItem() {
        Tracker tracker = new Tracker();
        Item item = new Item("new item");
        tracker.add(item);
        String[] answers = {item.getId()};
        UserAction action = new DeleteAction();
        action.execute(new StubInput(answers), tracker);
        Item deletedItem = tracker.findById(item.getId());
        assertNull(deletedItem);
    }

    @Test
    public void whenExit() {
        StubInput input = new StubInput(
                new String[] {"0"}
        );
        StubAction action = new StubAction();
        List<UserAction> actions = new ArrayList<UserAction>();
        actions.add(action);
        new StartUI().init(input, new Tracker(), actions);
        assertThat(action.isCall(), is(true));
    }
}
