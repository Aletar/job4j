package ru.job4j.condition;

public class Max {
    public static int max(int left, int right) {
        int result = left > right ? left : right;
        return result;
    }

    public static int max(int first, int second, int third) {
        int left = max(first, second);
        int right = third;
        int result = left > right ? left : right;
        return result;
    }

    public static int max(int first, int second, int third, int fourth) {
        int left = max(first, second);
        int right = max(third, fourth);
        int result = left > right ? left : right;
        return result;
    }
}
