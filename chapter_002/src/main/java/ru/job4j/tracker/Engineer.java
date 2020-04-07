package ru.job4j.tracker;

public class Engineer extends Profession {

    private EngineerType engineerType;

    public Model construct(TechnicalRequirement techRequirement) {
        return new Model();
    }
}
