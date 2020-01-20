package ru.job4j.array;

public class Turn {
    public int[] back(int[] array) {
        int j, tmp;
        int count = array.length / 2;
        for (int i = 0; i < count; i++) {
            j = array.length - 1 - i;
            tmp = array[i];
            array[i] = array[j];
            array[j] = tmp;
        }
        return array;
    }
}
