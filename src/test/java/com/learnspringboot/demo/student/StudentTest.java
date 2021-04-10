package com.learnspringboot.demo.student;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {

    Student student;

    @BeforeEach
    void setUp() {
        student = new Student();
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void givenStudentValidDobReturnTrue() {
        student.setEmail("billy@gmail.com");
        student.setName("billy");
        student.setAge(20);
        student.setDob(LocalDate.of(2020, 2, 1));
        student.setId(1L);
        assertEquals(student.isLocalDateValid(), true);
    }
    @Test
    void givenStudentValidDobReturnFalse() {
        student.setEmail("billy@gmail.com");
        student.setName("billy");
        student.setAge(20);
        student.setDob(LocalDate.of(2100, 2, 1));
        student.setId(1L);
        assertEquals(student.isLocalDateValid(), false);
    }
}