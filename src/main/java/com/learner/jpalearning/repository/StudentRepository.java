package com.learner.jpalearning.repository;


import com.learner.jpalearning.entity.Student;
import jakarta.persistence.Id;
import jakarta.transaction.Transactional;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.yaml.snakeyaml.events.Event;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {


    List<Student> findByFirstName(String firstName);

    List<Student> findByFirstNameContaining(String firstNameSubstr);


    List<Student> findByLastNameNotNull();

    List<Student> findByGuardianName(String guardianName);

    @Query("Select s from Student s where s.emailId = ?1")
    Student findByEmailId(String emailId);

    @Query("Select s.firstName from Student s where s.emailId = ?1")
    String findFirstNameByEmailId(String emailId);


    @Query(value = "Select * from Student s where email_id = ?1",nativeQuery = true)
    String findFirstNameByEmailIdNativeQuery(String emailId);

    @Query(value = "Select * from Student s where email_id = :emailId",nativeQuery = true)
    String findFirstNameByEmailIdNativeQueryWithNamedParam(@Param("emailId") String emailId);

    @Transactional
    @Modifying
    @Query(value = "UPDATE student  SET first_name = :firstName WHERE email_id = :emailId  ",nativeQuery = true)
    Integer updateStudentFirstNameByEmailID(@Param("firstName") String firstName, @Param("emailId") String emailId);
}

