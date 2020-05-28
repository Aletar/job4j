package ru.job4j.array;

public class SortSelected {
    public static int[] sort(int[] data) {
        int min, index, tmp;
        for (int i = 0; i < data.length; i++) {
            min = MinDiapason.findMin(data, i, data.length - 1);
            index = FindLoop.indexOf(data, min, i, data.length - 1);
            tmp = data[i];
            data[i] = data[index];
            data[index] = tmp;
        }
        return data;
    }
}
