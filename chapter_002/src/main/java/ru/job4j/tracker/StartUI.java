package ru.job4j.tracker;

import java.util.Scanner;

public class StartUI {
    public void init(Scanner scanner, Tracker tracker) {
        boolean run = true;
        while (run) {
            this.showMenu();
            System.out.print("Select: ");
            int select = Integer.valueOf(scanner.nextLine());
            if (select == 0) {
                System.out.println("=== Create a new Item ====");
                System.out.print("Enter name: ");
                String name = scanner.nextLine();
                Item item = new Item(name);
                tracker.add(item);
            } else if (select == 1) {
                System.out.println("=== Show all items ====");
                Item[] items = tracker.findAll();
                for (int i = 0; i < items.length; i++) {
                    System.out.println("id: " + items[i].getId() + ", name: " + items[i].getName());
                }
            } else if (select == 2) {
                System.out.println("=== Edit item ====");
                System.out.print("Enter id: ");
                String id = scanner.nextLine();
                Item item = tracker.findById(id);
                if (item == null) {
                    System.out.println("Item not found by id: " + id);
                } else {
                    System.out.print("Enter new name: ");
                    String name = scanner.nextLine();
                    item.setName(name);
                    System.out.print("Item changed");
                }
            } else if (select == 3) {
                System.out.println("=== Delete item ====");
                System.out.print("Enter id: ");
                String id = scanner.nextLine();
                int index = tracker.indexById(id);
                if (index == -1) {
                    System.out.println("Item not found by id: " + id);
                } else {
                    tracker.deleteByIndex(index);
                    System.out.print("Item deleted");
                }
            } else if (select == 4) {
                System.out.println("=== Find item by Id ====");
                System.out.print("Enter id: ");
                String id = scanner.nextLine();
                Item item = tracker.findById(id);
                if (item == null) {
                    System.out.println("Item not found by id: " + id);
                } else {
                    System.out.println("id: " + item.getId() + ", name: " + item.getName());
                }

            } else if (select == 5) {
                System.out.println("=== Find items by name ====");
                System.out.print("Enter name: ");
                String name = scanner.nextLine();
                Item[] items = tracker.findByName(name);
                if (items.length == 0) {
                    System.out.println("Items not found name: " + name);
                } else {
                    for (int i = 0; i < items.length; i++) {
                        System.out.println("id: " + items[i].getId() + ", name: " + items[i].getName());
                    }
                }
            } else if (select == 6) {
                run = false;
            }
        }
    }

    private void showMenu() {
        System.out.println("Menu.");
        System.out.println("0. Add new Item");
        System.out.println("1. Show all items");
        System.out.println("2. Edit item");
        System.out.println("3. Delete item");
        System.out.println("4. Find item by Id");
        System.out.println("5. Find items by name");
        System.out.println("6. Exit Program");
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Tracker tracker = new Tracker();
        new StartUI().init(scanner, tracker);
    }
}
