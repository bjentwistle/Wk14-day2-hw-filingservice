package com.codeclan.example.filingservice.repositories;

import com.codeclan.example.filingservice.models.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonRepo extends JpaRepository<Person, Long> {
}
