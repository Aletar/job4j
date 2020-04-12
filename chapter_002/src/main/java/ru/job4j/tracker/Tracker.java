package ru.job4j.tracker;

import java.util.Arrays;
import java.util.Random;

public class Tracker {
    /**
     * Массив для хранения заявок.
     */
    private final Item[] items = new Item[100];

    /**
     * Указатель ячейки для новой заявки.
     */
    private int position = 0;

    /**
     * Метод добавления заявки в хранилище
     * @param item новая заявка
     */
    public Item add(Item item) {
        item.setId(generateId());
        items[position++] = item;
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
     * @return массив Item.
     */
    public Item[] findAll() {
        return items;
    }

    /**
     * Поиск все элементов с именем key
     * @param key имя элемента
     * @return массив Item.
     */
    public Item[] findByName(String key) {
        Item[] result = new Item[position];
        int size = 0;
        for (int index = 0; index < position; index++) {
            if (items[index].getName().equals(key)) {
                result[size] = items[index];
                size++;
            }
        }
        return Arrays.copyOf(result, size);
    }

    /**
     * Поиск элемента по уникальному ключу
     * @param id уникальный ключ
     * @return Item.
     */
    public Item findById(String id) {
        for (int index = 0; index < position; index++) {
            if (items[index].getId().equals(id)) {
                return items[index];
            }
        }
        return null;
    }
}
