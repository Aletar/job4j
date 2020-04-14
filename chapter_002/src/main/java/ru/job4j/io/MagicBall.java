package ru.job4j.io;

import java.util.Random;
import java.util.Scanner;

public class MagicBall {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Я великий Оракул. Что ты хочешь узнать? ");
        String name = input.nextLine();
        System.out.println(getAnswer());
    }

    public static String getAnswer() {

        int answer = new Random().nextInt(3);

        if (answer == 0) {
            return "Да";
        } else if (answer == 1) {
            return "Нет";
        } else {
            return "Может быть";
        }

    }

}
