package ru.job4j.stream;

import java.lang.constant.Constable;
import java.util.Objects;

public class Tuple implements Comparable {
    private String name;
    private double score;

    public Tuple(String name, double score) {
        this.name = name;
        this.score = score;
    }

    public double getScore() {
        return this.score;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Tuple tuple = (Tuple) o;
        return Double.compare(tuple.score, score) == 0 &&
                Objects.equals(name, tuple.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, score);
    }

    @Override
    public int compareTo(Object o) {
        Tuple t = (Tuple) o;
        int scoreCompareResult = Double.compare(this.score, t.score);
        if (scoreCompareResult != 0) {
            return scoreCompareResult;
        } else {
            return this.name.compareTo(t.name);
        }
    }
}