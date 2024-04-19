package com.p2e.Admin;

import com.p2e.Admin.model.Student;
import com.p2e.Admin.repositery.InMemoryStudentRepository;
import com.p2e.Admin.repositery.StudentRepository;
import com.p2e.Admin.service.StudentService;
import com.p2e.Admin.service.StudentServiceImpl;
import com.p2e.Admin.service.StudentServiceMock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StudentApplication {


	public static void main(String[] args) {
		// Création d'une instance de StudentServiceImpl en lui passant l'instance de StudentRepository
		StudentServiceMock studentServiceMock = new StudentServiceMock();

      // Affichage de tous les étudiants
		studentServiceMock.displayAllStudents();
		studentServiceMock.findById(2);


	}}
