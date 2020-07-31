package ru.job4j.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Stream {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        arrayList.add(123);
        arrayList.add(-2);
        arrayList.add(0);
        arrayList.add(-23);
        arrayList.add(432);
        arrayList.add(9);

        List<Integer> list = arrayList.stream().filter(i -> i > 0).collect(Collectors.toList());

        list.forEach(System.out::println);
    }
}
