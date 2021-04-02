package com.learnspringboot.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.util.List;

@Configuration
public class StudentConfig {
    @Bean
    CommandLineRunner commandLineRunner(StudentRepository studentRepository) {
        return args -> {
            Student s1 = new Student("maria", LocalDate.of(2000,2,10), "sdsds@gmail.com");
            Student s2 = new Student("Billy", LocalDate.of(1999,2,10), "billy.matjik@gmail.com");
            studentRepository.saveAll(List.of(s1, s2));
        };
    }
}
