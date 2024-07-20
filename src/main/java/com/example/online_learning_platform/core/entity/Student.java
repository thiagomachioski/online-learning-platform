package com.example.online_learning_platform.core.entity;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;


@Data
@Entity
@DiscriminatorValue("STUDENT")
@EqualsAndHashCode(callSuper = true)
public class Student extends AppUser {
    @OneToMany(mappedBy = "student")
    private List<Enrollment> enrollments;
}
