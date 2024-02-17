package com.learner.jpalearning.repository;

import com.learner.jpalearning.entity.Course;
import com.learner.jpalearning.entity.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TeacherRepository extends JpaRepository<Teacher, Long> {

    
}
