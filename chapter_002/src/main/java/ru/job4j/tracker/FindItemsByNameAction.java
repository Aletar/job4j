package ru.job4j.tracker;

import java.util.List;

public class FindItemsByNameAction implements UserAction {
    @Override
    public String name() {
        return "=== Find items by name ====";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        String name = input.askStr("Enter name: ");
        List<Item> items = tracker.findByName(name);
        if (items.size() == 0) {
            System.out.println("Items not found name: " + name);
        } else {
            for (Item item: items) {
                System.out.println(item);
            }
        }
        return true;
    }
}
