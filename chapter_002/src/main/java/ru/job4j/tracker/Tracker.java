package ru.job4j.tracker;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Tracker {
    /**
     * Массив для хранения заявок.
     */
    private final List<Item> items = new ArrayList<Item>();

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

    public int indexOf(String id) {
        int index = -1;
        for (Item item: items) {
            index++;
            if (item.getId().equals(id)) {
                return index;
            }
        }
        return -1;
    }

    public boolean delete(String id) {
        int index = indexOf(id);
        if (index == -1) {
            return false;
        }
        items.remove(index);
        return true;
    }

    public boolean replace(String id, Item newItem) {
        int index = indexOf(id);
        if (index == -1) {
            return false;
        }
        newItem.setId(generateId());
        items.set(index, newItem);
        return true;
    }

}