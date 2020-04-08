package ru.job4j.pojo;

import java.util.Date;

public class College {

    public static void main(String[] args) {
        Student student = new Student();
        student.setFullName("Иванов Иван Иванович");
        student.setGroup("ИВТ-01");
        student.setEntranceDate(new Date());

        System.out.println(student.getFullName() + " studying in group " + student.getGroup() + " from " + student.getEntranceDate());
    }

}
