package com.learner.jpalearning.repository;

import com.learner.jpalearning.entity.CourseMaterial;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseMaterialRepository extends JpaRepository< CourseMaterial, Long> {
}
