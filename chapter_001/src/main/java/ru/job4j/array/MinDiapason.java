package ru.job4j.array;

public class MinDiapason {
    public static int findMin(int[] array, int start, int finish) {
        int min = array[start];
        int end = finish < array.length - 1 ? finish : array.length - 1;
        for (int index = start + 1; index <= end; index++) {
            min = array[index] < min ? array[index] : min;
        }
        return min;
    }
}
