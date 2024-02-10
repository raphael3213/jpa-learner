package com.learner.jpalearning.entity;


import jakarta.persistence.AttributeOverride;
import jakarta.persistence.AttributeOverrides;
import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@AttributeOverrides({
        @AttributeOverride(name = "name", column = @Column(name = "guardian_name")),
        @AttributeOverride(name = "email", column = @Column(name = "guardian_email")),
        @AttributeOverride(name = "number", column = @Column(name = "guardian_number"))
})
@Data
@Embeddable
@AllArgsConstructor
@NoArgsConstructor
public class Guardian {


    private String name;
    private String email;
    private String number;
}
