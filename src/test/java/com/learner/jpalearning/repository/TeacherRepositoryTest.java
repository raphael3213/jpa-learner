package com.learner.jpalearning.repository;

import com.learner.jpalearning.entity.Course;
import com.learner.jpalearning.entity.Teacher;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;


@SpringBootTest
class TeacherRepositoryTest {


    @Autowired TeacherRepository teacherRepository;

    @Test
    public void saveTeacher_basic(){

        Course courseMath = Course.builder().title("Math").credit(5).build();
        Course courseJava = Course.builder().title("Java").credit(5).build();
//        Teacher teacher = Teacher.builder().firstName("Kamala").lastName("khan").courses(List.of(courseMath, courseJava)).build();
    }

}