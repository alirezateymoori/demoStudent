package com.demisco;

import com.demisco.domain.Student;
import com.demisco.service.StudentManager;
import com.demisco.service.impl.StudentManagerImpl;

import java.util.List;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        StudentManager manager = new StudentManagerImpl();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Student Management System:");
            System.out.println("1. Add Student");
            System.out.println("2. View Student");
            System.out.println("3. Update Student");
            System.out.println("4. Delete Student");
            System.out.println("5. List Students");
            System.out.println("6. Exit");

            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("ID:");
                    int id = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Name:");
                    String name = scanner.nextLine();
                    System.out.println("Age:");
                    int age = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Grade:");
                    String grade = scanner.nextLine();
                    manager.addStudent(new Student(id, name, age, grade));
                    break;
                case 2:
                    System.out.println("ID:");
                    id = scanner.nextInt();
                    Student student = manager.getStudent(id);
                    if (student != null) {
                        System.out.println(student);
                    } else {
                        System.out.println("Student with this ID not found.");
                    }
                    break;
                case 3:
                    System.out.println("ID:");
                    id = scanner.nextInt();
                    scanner.nextLine();
                    Student existingStudent = manager.getStudent(id);
                    if (existingStudent != null) {
                        System.out.println("New Name:");
                        String newName = scanner.nextLine();
                        System.out.println("New Age:");
                        int newAge = scanner.nextInt();
                        scanner.nextLine();
                        System.out.println("New Grade:");
                        String newGrade = scanner.nextLine();
                        manager.updateStudent(id, new Student(id, newName, newAge, newGrade));
                    } else {
                        System.out.println("Student with this ID not found.");
                    }
                    break;
                case 4:
                    System.out.println("ID:");
                    id = scanner.nextInt();
                    existingStudent = manager.getStudent(id);
                    if (existingStudent != null) {
                        manager.deleteStudent(id);
                    } else {
                        System.out.println("Student with this ID not found.");
                    }
                    break;
                case 5:
                    List<Student> students = manager.getAllStudents();
                    for (Student s : students) {
                        System.out.println(s);
                    }
                    break;
                case 6:
                    System.out.println("Have a good time.");
                    return;
                default:
                    System.out.println("Invalid Number.");
            }
        }
    }
}
