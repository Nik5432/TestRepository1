package com.example.database_spring.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Table
@Entity
public class PeopleNew {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private String surname;

    public PeopleNew(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    protected PeopleNew() {
    }
}
