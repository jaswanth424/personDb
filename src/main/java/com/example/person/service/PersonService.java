package com.example.person.service;

import com.example.person.model.Person;
import com.example.person.respository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonService {
    @Autowired
    private PersonRepository personRepository;

    public List<Person> getAll() {
        List<Person> people = personRepository.findAll();
        System.out.println("Fetched people: " + people); // Debugging log
        return people;
    }
}
