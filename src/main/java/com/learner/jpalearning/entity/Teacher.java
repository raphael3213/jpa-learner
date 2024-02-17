package com.learner.jpalearning.entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Teacher {

    @Id
    @SequenceGenerator(name="teacher_sequence", sequenceName = "teacher_sequence", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "teacher_sequence")
    @Column(name = "teacher_id")
    private Long teacherId;
    private String firstName;
    private String lastName;

//    @OneToMany(cascade = CascadeType.ALL)
//    @JoinColumn(
//            name = "teacher_id",
//            referencedColumnName = "teacherId"
//    )
//    private List<Course> courses;

}
