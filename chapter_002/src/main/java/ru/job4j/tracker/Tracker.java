package ru.job4j.tracker;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Tracker {
    /**
     * Массив для хранения заявок.
     */
    private final ArrayList<Item> items = new ArrayList<Item>();

    /**
     * Метод добавления заявки в хранилище
     * @param item новая заявка
     */
    public Item add(Item item) {
        item.setId(generateId());
        items.add(item);
        return item;
    }

    /**
     * Метод генерирует уникальный ключ для заявки.
     * Так как у заявки нет уникальности полей, имени и описание. Для идентификации нам нужен уникальный ключ.
     * @return Уникальный ключ.
     */
    private String generateId() {
        Random rm = new Random();
        return String.valueOf(rm.nextLong() + System.currentTimeMillis());
    }

    /**
     * Метод формирует копию массива без элементов null.
     * @return ArrayList<Item>.
     */
    public List<Item> findAll() {
        return items;
    }

    /**
     * Поиск все элементов с именем key
     * @param key имя элемента
     * @return массив Item.
     */
    public List<Item> findByName(String key) {
        List<Item> result = new ArrayList<Item>();
        for (Item item: items) {
            if (item.getName().equals(key)) {
                result.add(item);
            }
        }
        return result;
    }

    /**
     * Поиск элемента по уникальному ключу
     * @param id уникальный ключ
     * @return Item.
     */
    public Item findById(String id) {
        for (Item item: items) {
            if (item.getId().equals(id)) {
                return item;
            }
        }
        return null;
    }

    public boolean delete(String id) {
        Item item = findById(id);
        if (item == null) {
            return false;
        }
        items.remove(item);
        return true;
    }

    public boolean replace(String id, Item newItem) {
        Item item = findById(id);
        if (item == null) {
            return false;
        }
        newItem.setId(id);
        items.set(items.indexOf(item), newItem);
        return true;
    }

}