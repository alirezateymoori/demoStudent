package com.demisco.service.impl;

import com.demisco.domain.Student;
import com.demisco.service.StudentManager;

import java.util.ArrayList;
import java.util.List;

public class StudentManagerImpl implements StudentManager {
    private  List<Student> students = new ArrayList<>();

    @Override
    public void addStudent(Student student) {
        students.add(student);
    }

    @Override
    public Student getStudent(int id) {
        for (Student student : students) {
            if (student.id == id) {
                return student;
            }
        }
        return null;
    }

    @Override
    public void updateStudent(int id, Student updatedStudent) {
        for (Student student : students) {
            if (student.id == id) {
                student.name = updatedStudent.name;
                student.age = updatedStudent.age;
                student.grade = updatedStudent.grade;
                return;
            }
        }
    }

    @Override
    public void deleteStudent(int id) {
        students.removeIf(student -> student.id == id);
    }

    @Override
    public List<Student> getAllStudents() {
        return students;
    }
}
