package ru.job4j.io;

import java.util.Scanner;

public class Matches {

    public static void main(String[] args) {
        int matchesCount = 11;
        int numPlayer = 1;
        int matchesCanTake;

        Scanner input = new Scanner(System.in);
        boolean run = true;
        while (run) {
            matchesCanTake = Math.min(matchesCount, 3);
            System.out.println("Всего спичек: " + matchesCount);
            System.out.print("Ход игрока " + numPlayer + ". Сколько спичек взять (не больше " + matchesCanTake + "): ");
            int select = Integer.valueOf(input.nextLine());
            if (select <= matchesCanTake) {
                matchesCount -= select;
                if (matchesCount == 0) {
                    System.out.println("Игра завершена. Победил игрок " + numPlayer);
                    run = false;
                } else {
                    numPlayer = numPlayer == 1 ? 2 : 1;
                }
            } else {
                System.out.println("Взять можно не больше " + matchesCanTake + " спичек. Попробуйте ещё раз.");
            }
        }
    }
}
