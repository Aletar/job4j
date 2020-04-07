package ru.job4j.tracker;

public class Doctor extends Profession {

    private boolean isVeterinarian;

    public Diagnose checkUp(Patient patient) {
        return new Diagnose();
    }
}
