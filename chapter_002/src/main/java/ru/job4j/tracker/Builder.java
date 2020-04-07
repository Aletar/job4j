package ru.job4j.tracker;

public class Builder extends Engineer {

    public Construction build(Project project) {
        return new Construction();
    }

}
