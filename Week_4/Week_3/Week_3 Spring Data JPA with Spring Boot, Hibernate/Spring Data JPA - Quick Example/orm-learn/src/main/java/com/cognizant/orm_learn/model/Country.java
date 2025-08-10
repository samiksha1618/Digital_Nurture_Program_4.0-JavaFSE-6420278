package com.cognizant.orm_learn.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Country {

    @Id
    private String code;
    private String name;

    // Getters and Setters
}
