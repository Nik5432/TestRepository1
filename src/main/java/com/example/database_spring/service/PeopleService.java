package com.example.database_spring.service;

import com.example.database_spring.model.People;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.database_spring.repository.PeopleRepository;

@Service
public class PeopleService {

    @Autowired
    private PeopleRepository repository;

    public void saveByParams(String surname, String name) {

        if (surname != null && name != null) {
            repository.save(new People(name, surname));
        }
    }

}
