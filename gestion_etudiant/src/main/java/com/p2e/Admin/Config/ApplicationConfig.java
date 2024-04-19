package com.p2e.Admin.Config;

import com.p2e.Admin.repositery.InMemoryStudentRepository;
import com.p2e.Admin.repositery.StudentRepository;
import com.p2e.Admin.service.StudentService;
import com.p2e.Admin.service.StudentServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationConfig {

    @Bean
    public StudentRepository studentRepository() {
        return new InMemoryStudentRepository();
    }

    @Bean
    public StudentService studentService(StudentRepository studentRepository) {
        return new StudentServiceImpl(studentRepository);
    }


}
