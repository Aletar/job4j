package ru.job4j.calculator;

public class Fit {

    public static double manWeight(double height) {
        return (height - 100) * 1.15;
    }

    public static double womanWeight(double height) {
        return (height - 110) * 1.15;
    }

    public static void main(String[] args) {
        double man = manWeight(186);
        System.out.println("Man 186 is " + man);

        double woman = womanWeight(172);
        System.out.println("Woman 172 is " + woman);
    }

}