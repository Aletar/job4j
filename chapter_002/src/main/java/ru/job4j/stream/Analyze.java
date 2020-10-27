package ru.job4j.stream;


import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Analyze {

    private static Comparator<Tuple> comparatorTuple = (o1, o2) -> o1.compareTo(o2);

    public static double averageScore(Stream<Pupil> stream) {
        return stream
                .flatMap(pupil -> pupil.getSubjects().stream())
                .mapToInt(Subject::getScore)
                .average()
                .orElse(0D);

    }

    public static List<Tuple> averageScoreBySubject(Stream<Pupil> stream) {
        return stream
                .map(pupils -> new Tuple(pupils.getName(),
                        pupils.getSubjects().stream()
                                .mapToInt(Subject::getScore)
                                .average()
                                .orElse(0D)))
                .collect(Collectors.toList());
    }

    public static List<Tuple> averageScoreByPupil(Stream<Pupil> stream) {
        return stream
                .flatMap(pupil -> pupil.getSubjects().stream())
                .collect(Collectors.groupingBy(Subject::getName, Collectors.averagingDouble(Subject::getScore)))
                .entrySet()
                .stream()
                .map(map -> new Tuple(map.getKey(), map.getValue()))
                .collect(Collectors.toList());
    }

    public static Tuple bestStudent(Stream<Pupil> stream) {
        return stream.map(pupils -> new Tuple(pupils.getName(), pupils.getSubjects().stream()
                .mapToInt(Subject::getScore)
                .sum()))
                .max(comparatorTuple).orElse(null);
    }

    public static Tuple bestSubject(Stream<Pupil> stream) {
        return stream
                .flatMap(pupil -> pupil.getSubjects().stream())
                .collect(Collectors.groupingBy(Subject::getName, Collectors.summingInt(Subject::getScore)))
                .entrySet()
                .stream()
                .map(map -> new Tuple(map.getKey(), map.getValue()))
                .max(comparatorTuple).orElse(null);
    }
}
