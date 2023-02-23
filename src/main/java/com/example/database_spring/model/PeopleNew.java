package com.example.database_spring.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Table
@Entity
public class PeopleNew {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id_update;
    private String name;
    private String surname;

    @Column(name = "surname_test3")
    private String surname2;

    public PeopleNew(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    protected PeopleNew() {
    }
}
