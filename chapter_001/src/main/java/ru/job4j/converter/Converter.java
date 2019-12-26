package ru.job4j.converter;

public class Converter {
    public static int rubleToEuro(int value) {
        return value / 70;
    }

    public static int rubleToDollar(int value) {
        return value / 60;
    }

    public static int euroToRuble(int value) {
        return value * 70;
    }

    public static int dollarToRuble(int value) {
        return value * 60;
    }

    public static void main(String[] args) {

        int in, expected, out;
        boolean passed;

        in = 140;
        expected = 2;
        out = rubleToEuro(in);
        passed = expected == out;
        System.out.println("140 rubles are 2 euro. Test result: " + passed);

        in = 180;
        expected = 3;
        out = rubleToDollar(in);
        passed = expected == out;
        System.out.println("180 rubles are 3 dollars. Test result: " + passed);

        in = 4;
        expected = 280;
        out = euroToRuble(in);
        passed = expected == out;
        System.out.println("4 euro are 280 rubles. Test result: " + passed);

        in = 5;
        expected = 300;
        out = dollarToRuble(in);
        passed = expected == out;
        System.out.println("5 dollars are 300 rubles. Test result: " + passed);
    }

}
