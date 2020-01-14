package ru.job4j.condition;

public class MultiMax {
    public int max(int first, int second, int third) {
        int tmp  = first > second ? first : second;
        int result = tmp > third ? tmp : third;
        return result;
    }
}
