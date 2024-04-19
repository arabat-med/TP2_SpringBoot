package com.p2e.Admin.service;

import com.p2e.Admin.model.Student;

import java.util.List;

public interface StudentService {
    void createStudent(Student student);
    Student findById(int id);
    void displayAllStudents();
}