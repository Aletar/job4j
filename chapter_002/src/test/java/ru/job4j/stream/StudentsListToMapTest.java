package ru.job4j.stream;

import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.assertEquals;

public class StudentsListToMapTest {
    @Test
    public void whenStudentInMap() {
        List<Student> students = List.of(
                new Student("Иванов", 78),
                new Student("Сидоров", 22),
                new Student("Петров", 54),
                new Student("Сидоров", 99),
                new Student("Зайцев", 68));

        Map<String, Student> map = new HashMap<String, Student>();
        map.put("Иванов", new Student("Иванов", 78));
        map.put("Петров", new Student("Петров", 54));
        map.put("Сидоров", new Student("Сидоров", 99));
        map.put("Зайцев", new Student("Зайцев", 68));

        assertEquals(Students.listToMap(students), map);
    }
}
