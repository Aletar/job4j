package ru.job4j.stream;

import java.util.Arrays;
import java.util.stream.Collectors;

public class MatrixToList {
    public static void main(String[] args) {
        Integer[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 0, 0}
        };

        Arrays.stream(matrix).
                flatMap(Arrays::stream).
                collect(Collectors.toList()).
                forEach(i -> System.out.print(i.toString() + " "));

    }
}
