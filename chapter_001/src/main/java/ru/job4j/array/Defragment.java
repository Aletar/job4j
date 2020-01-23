package ru.job4j.array;

public class Defragment {
    public static String[] compress(String[] array) {
        int tmpIndex = 0;
        String tmpCell;
        for (int index = 0; index < array.length; index++) {
            String cell = array[index];
            if (cell == null) {
                tmpIndex = index + 1;
                while (tmpIndex < array.length && array[tmpIndex] == null) {
                    tmpIndex++;
                }
                if (tmpIndex < array.length) {
                    tmpCell = array[tmpIndex];
                    array[tmpIndex] = array[index];
                    array[index] = tmpCell;
                }
                else break;
            }
            System.out.print(array[index] + " ");
        }
        return array;
    }

    public static void main(String[] args) {
        String[] input = {"I", null, "wanna", null, "be", null, "compressed"};
        String[] compressed = compress(input);
        System.out.println();
        for (int index = 0; index < compressed.length; index++) {
            System.out.print(compressed[index] + " ");
        }
    }
}
