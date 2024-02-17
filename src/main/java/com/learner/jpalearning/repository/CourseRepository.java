package com.learner.jpalearning.repository;

import com.learner.jpalearning.entity.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository<Course, Long> {
}
