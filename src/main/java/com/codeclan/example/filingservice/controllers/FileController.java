package com.codeclan.example.filingservice.controllers;

import com.codeclan.example.filingservice.models.File;
import com.codeclan.example.filingservice.repositories.FileRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class FileController {
    @Autowired
    FileRepo fileRepo;

    @GetMapping(value = "/files")
    public ResponseEntity<List<File>> getAllFiles(){
        return new ResponseEntity<>(fileRepo.findAll(), HttpStatus.OK);
    }

    @GetMapping(value = "/files/{id}")
    public ResponseEntity  getFileByID(@PathVariable Long id){
        return new ResponseEntity<>(fileRepo.findById(id), HttpStatus.OK);
    }

    @PostMapping(value = "/files")
    public ResponseEntity<File> postPerson(@RequestBody File file){
        fileRepo.save(file);
        return new ResponseEntity<>(file, HttpStatus.CREATED);

    }

}

