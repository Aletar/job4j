package ru.job4j.oop;

public class Jukebox {
    public void music(int position) {
        switch (position) {
            case 1:
                System.out.println("Пусть бегут неуклюже");
                break;
            case 2:
                System.out.println("Спят усталые игрушки");
                break;
            default:
                System.out.println("Песня не найдена");
        }
    }

    public static void main(String[] args) {
        Jukebox sony = new Jukebox();
        sony.music(1);
        sony.music(2);
        sony.music(10);
    }
}
