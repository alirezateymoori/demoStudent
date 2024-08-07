package com.demisco.service;

import com.demisco.domain.Student;

import java.util.List;

public interface StudentManager {
    void addStudent(Student student);

    Student getStudent(int id);

    void updateStudent(int id, Student updatedStudent);

    void deleteStudent(int id);

    List<Student> getAllStudents();
}
