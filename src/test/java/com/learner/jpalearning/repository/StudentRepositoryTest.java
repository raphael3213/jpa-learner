package com.learner.jpalearning.repository;

import com.learner.jpalearning.entity.Guardian;
import com.learner.jpalearning.entity.Student;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;

import java.security.Guard;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class StudentRepositoryTest {

    @Autowired
    private StudentRepository studentRepository;

    @Test
    public void save_basicTest(){
        Student s = Student.builder()
                .emailId("joel1@gmail.com")
                .firstName("Joel")
                .lastName("Peter")
//                .guardianName("Hansel")
//                .guardianNumber("999999999")
//                .guardianEmail("hansel@gmail.com")
                .build();
        
        studentRepository.save(s);
    }

    @Test
    public void saveWithEmbeddedGuardian_basicTest(){
        Guardian guardian = new Guardian("Hansel","999999999" ,"hansel@gmail.com");
        Student s = Student.builder()
                .emailId("joel_123@gmail.com")
                .firstName("Joel")
                .lastName("Peter")
                .guardian(guardian)
                .build();

        studentRepository.save(s);
    }

    @Test
    public void printStudentsByFirstName_basicTest(){
        List<Student> studentList = studentRepository.findByFirstName("Joel");

        System.out.println("List of students : " + studentList);
    }

    @Test
    public void printStudentsByFirstNameWithSubstring_basicTest(){
        List<Student> studentList = studentRepository.findByFirstNameContaining("oe");

        System.out.println("List of students containing 'oe': " + studentList);
    }

    @Test
    public void printStudentsByGuardian_basicTest(){
        List<Student> studentList = studentRepository.findByGuardianName("hansel");

        System.out.println("List of students with guardian hansel: " + studentList);
    }



}