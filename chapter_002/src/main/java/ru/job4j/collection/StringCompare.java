package ru.job4j.collection;

import java.util.Comparator;

public class StringCompare implements Comparator<String> {
    @Override
    public int compare(String left, String right) {

        int leftLength = left.length();
        int rightLength = right.length();

        int count = Math.min(leftLength, rightLength);
        int tmp;
        for (int i = 0; i < count; i++) {
             tmp = Character.compare(left.charAt(i), right.charAt(i));
             if (tmp != 0) {
                 return tmp;
             }
        }
        return Integer.compare(leftLength, rightLength);
    }
}