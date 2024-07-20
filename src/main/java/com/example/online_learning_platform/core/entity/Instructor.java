package com.example.online_learning_platform.core.entity;


import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;

@Data
@Entity
@DiscriminatorValue("INSTRUCTOR")
@EqualsAndHashCode(callSuper = true)
public class Instructor extends AppUser {
    @OneToMany(mappedBy = "instructor")
    private List<Course> courses;
}