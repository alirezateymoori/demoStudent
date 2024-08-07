package com.demisco.domain;

public class Student {
    public int id;
    public String name;
    public int age;
    public String grade;

    public Student(int id, String name, int age, String grade) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Student{"+
                "id=" + id +
                ", name='" + name+
                ", age=" + age +
                ", grade='" + grade +
                '}';
    }
}