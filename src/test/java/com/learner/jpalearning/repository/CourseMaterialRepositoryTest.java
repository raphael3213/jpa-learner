package com.learner.jpalearning.repository;

import com.learner.jpalearning.entity.Course;
import com.learner.jpalearning.entity.CourseMaterial;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;


@SpringBootTest
class CourseMaterialRepositoryTest {


    @Autowired
    private CourseMaterialRepository courseMaterialRepository;

//    @Autowired
//    private CourseRepository courseRepository;



    @Test
    public void saveCourseMaterial_basic(){
        Course course = Course.builder().title("Science").credit(10).build();
//        courseRepository.save(course);

        CourseMaterial courseMaterial = CourseMaterial.builder().course(course).url("https://google.com").build();

        courseMaterialRepository.save(courseMaterial);
    }

    @Test
    public void printAllCourseMaterial_basic(){
        List<CourseMaterial> courseMaterials =courseMaterialRepository.findAll();

        System.out.println("List of CourseMaterials :" + courseMaterials);
    }

}