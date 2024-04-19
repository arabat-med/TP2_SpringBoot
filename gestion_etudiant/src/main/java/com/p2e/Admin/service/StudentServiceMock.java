
package com.p2e.Admin.service;

import com.p2e.Admin.model.Student;

import java.util.ArrayList;
import java.util.List;

public class StudentServiceMock implements StudentService {
    private List<Student> studentList;

    // Constructeur
    public StudentServiceMock() {
        // Initialisation avec des données fictives
        studentList = new ArrayList<>();
        studentList.add(new Student(2, "houda kadi", 28));
        studentList.add(new Student(3, "Asma njari", 21));
        studentList.add(new Student(4, "Nor air", 26));
    }

    @Override
    public void createStudent(Student student) {
        // Pour les besoins de cette simulation, ajouter un nouvel étudiant à la liste
        studentList.add(student);
    }

    @Override
    public Student findById(int id) {
        // Recherche de l'étudiant par son identifiant
        for (Student student : studentList) {
            if (student.getId() == id) {
                return student;
            }
        }
        return null; // Retourne null si aucun étudiant n'est trouvé avec cet identifiant
    }

    @Override
    public void displayAllStudents() {
        // Affichage de tous les étudiants dans la liste
        System.out.println("All studen are :");
        for (Student student : studentList) {
            System.out.println(student.getName() + " - " + student.getAge());
        }
    }
}

