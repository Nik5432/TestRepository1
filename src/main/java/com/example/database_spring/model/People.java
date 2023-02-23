package com.example.database_spring.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Table
@Entity
public class People {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private String surname;

    public People(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    protected People() {
    }
}
