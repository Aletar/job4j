package ru.job4j.stream;

import org.junit.Test;

import java.util.List;

import org.junit.Assert;

public class MatrixToListTest {

    @Test
    public void test1() {
        Integer[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 0, 0}
        };

        List<Integer> list = MatrixToList.matrixToList(matrix);

        Assert.assertEquals(list, List.of(1, 2, 3, 4, 5, 6, 7, 0, 0));
    }

}
