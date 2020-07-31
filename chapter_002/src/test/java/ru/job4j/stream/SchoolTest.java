package ru.job4j.stream;

import org.junit.Test;

import java.util.List;

import org.junit.Assert;


public class SchoolTest {
    @Test
    public void getStudentsForA() {
        List<Student> students = List.of(
                new Student("Иванов", 78),
                new Student("Петров", 54),
                new Student("Сидоров", 99),
                new Student("Зайцев", 68),
                new Student("Волков", 83),
                new Student("Лисин", 46),
                new Student("Медведев", 32),
                new Student("Соколов", 100));

        List<Student> studentsA = School.collect(students, s -> s.getScore() >= 70);

        Assert.assertEquals(studentsA, List.of(
                new Student("Иванов", 78),
                new Student("Сидоров", 99),
                new Student("Волков", 83),
                new Student("Соколов", 100)));
    }

    @Test
    public void getStudentsForB() {
        List<Student> students = List.of(
                new Student("Иванов", 78),
                new Student("Петров", 54),
                new Student("Сидоров", 99),
                new Student("Зайцев", 68),
                new Student("Волков", 83),
                new Student("Лисин", 46),
                new Student("Медведев", 32),
                new Student("Соколов", 100));

        List<Student> studentsB = School.collect(students, s -> s.getScore() >= 50 && s.getScore() < 70);

        Assert.assertEquals(studentsB, List.of(
                new Student("Петров", 54),
                new Student("Зайцев", 68)));
    }

    @Test
    public void getStudentsForC() {
        List<Student> students = List.of(
                new Student("Иванов", 78),
                new Student("Петров", 54),
                new Student("Сидоров", 99),
                new Student("Зайцев", 68),
                new Student("Волков", 83),
                new Student("Лисин", 46),
                new Student("Медведев", 32),
                new Student("Соколов", 100));

        List<Student> studentsC = School.collect(students, s -> s.getScore() < 50);

        Assert.assertEquals(studentsC, List.of(
                new Student("Лисин", 46),
                new Student("Медведев", 32)));
    }
}
