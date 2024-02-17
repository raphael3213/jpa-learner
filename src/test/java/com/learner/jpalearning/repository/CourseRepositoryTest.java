package com.learner.jpalearning.repository;

import com.learner.jpalearning.entity.Course;
import com.learner.jpalearning.entity.Teacher;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class CourseRepositoryTest {


    @Autowired
    private CourseRepository courseRepository;

    @Test
    public void printCourses_basic(){
        List<Course> courses = courseRepository.findAll();

        System.out.println("List of courses : " + courses);
    }


    @Test
    public void saveCourseWithTeacher_basic(){
        Teacher teacher = Teacher.builder().firstName("Martha").lastName("Dartha").build();
        Course englishCourse = Course.builder().title("English").teacher(teacher).credit(5).build();

        courseRepository.save(englishCourse);
    }

    @Test
    public void findAllPagination_basic(){
        Pageable firstPageWith1Records = PageRequest.of(1, 1);
        Pageable secondPageWith1Records = PageRequest.of(2, 1);

        List<Course> courses = courseRepository.findAll(firstPageWith1Records).getContent();

        Long totalElements = courseRepository.findAll(firstPageWith1Records).getTotalElements();


        System.out.println("First Page of courses  " + courses  + " has total elements of " + totalElements);
    }

    @Test
    public void findAllPaginationWithSorting_basic(){
        Pageable firstPageWith1Records = PageRequest.of(1, 1);
        Pageable secondPageWith1Records = PageRequest.of(2, 1);

        List<Course> courses = courseRepository.findAll(firstPageWith1Records).getContent();

        Long totalElements = courseRepository.findAll(firstPageWith1Records).getTotalElements();


        System.out.println("First Page of courses  " + courses  + " has total elements of " + totalElements);
    }

    @Test
    public void findByTitleWitPageRequest_basic(){
        Pageable firstPageWith1Records = PageRequest.of(0, 1);

        List<Course> courses = courseRepository.findByTitle("English", firstPageWith1Records).getContent();


        System.out.println("First Page of courses  " + courses );
    }
}