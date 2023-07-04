package com.codeclan.example.filingservice.controllers;

import com.codeclan.example.filingservice.models.Person;
import com.codeclan.example.filingservice.repositories.PersonRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class PersonController {
    @Autowired
    PersonRepo personRepo;

    @GetMapping(value = "/persons")
    public ResponseEntity<List<Person>> getAllPersons(){
        return new ResponseEntity<>(personRepo.findAll(), HttpStatus.OK);
    }

    @GetMapping(value = "/persons/{id}")
    public ResponseEntity  getPersonByID(@PathVariable Long id){
        return new ResponseEntity<>(personRepo.findById(id), HttpStatus.OK);
    }

    @PostMapping(value = "/persons")
    public ResponseEntity<Person> postPerson(@RequestBody Person person){
        personRepo.save(person);
        return new ResponseEntity<>(person, HttpStatus.CREATED);

    }

}
