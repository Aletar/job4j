package ru.job4j.loop;

public class Counter {
    public int add(int start, int finish) {
        int sum = 0;
        for (int counter = start; counter <= finish; counter++) {
            if (counter % 2 == 0) {
                sum = sum + counter;
            }
        }
        return sum;
    }
}
