package ru.job4j.condition;

public class Point {

    public static double distance(int x1, int y1, int x2, int y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }

    public static void main(String[] args) {

        double result = distance(0, 0, 0, 2);
        System.out.println("result (0, 0) to (0, 2) " + result);

        result = distance(0, 0, 3, 4);
        System.out.println("result (0, 0) to (3, 4) " + result);

        result = distance(34, 56, 84, 5);
        System.out.println("result (34, 56) to (84, 5) " + result);
    }

}
