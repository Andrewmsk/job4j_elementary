package ru.job4j.pojo;

import java.time.LocalDate;

public class College {

    public static void main(String[] args) {
        Student student = new Student();
        student.setFio("Ivanov");
        student.setGroupName("Java");
        student.setDateCreated(LocalDate.now());
        System.out.println(student.getFio() + ", " + student.getGroupName() + ", " + student.getDateCreated());
    }
}
