package com.example.person.controller;

import com.example.person.model.Person;
import com.example.person.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/v1")
public class PersonController {
    @Autowired
    private PersonService personService;

    @GetMapping("/persons") // Use plural to follow REST conventions
    public List<Person> getAllPersons() {
        return personService.getAll();
    }
}
