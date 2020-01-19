package ru.job4j.calculator;

/**
 *  Calculator Класс для вычисления арифметических операций
 * @author Alexander Tarasyuk (alextarasyuk@gmail.com)
 */
public class Calculator {
    /**
     * Сложение
     * @param first первое слогаемое
     * @param second второе слогаемое
     */
    public static void add(double first, double second) {
        double result = first + second;
        System.out.println(first + " + " + second + " = " + result);
    }

    /**
     * Деление
     * @param first делимое
     * @param second делитель
     */
    public static void div(double first, double second) {
        double result = first / second;
        System.out.println(first + " / " + second + " = " + result);
    }

    /**
     * Вычитание
     * @param first уменьшаемое
     * @param second вычитаемое
     */
    public static void substrack(double first, double second) {
        double result = first - second;
        System.out.println(first + " - " + second + " = " + result);
    }

    /**
     * Умножение
     * @param first первый множитель
     * @param second второй множитель
     */
    public static void multiply(double first, double second) {
        double result = first * second;
        System.out.println(first + " * " + second + " = " + result);
    }

    /**
     * Main
     * @param args - args
     */
    public static void main(String[] args) {
        add(1, 1);
        div(4, 2);
        multiply(2, 1);
        substrack(10, 5);
    }

}
