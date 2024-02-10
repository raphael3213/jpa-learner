package com.learner.jpalearning.repository;


import com.learner.jpalearning.entity.Student;
import jakarta.persistence.Id;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.yaml.snakeyaml.events.Event;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {


    List<Student> findByFirstName(String firstName);

    List<Student> findByFirstNameContaining(String firstNameSubstr);


    List<Student> findByLastNameNotNull(String lastName);

    List<Student> findByGuardianName(String guardianName);
}
