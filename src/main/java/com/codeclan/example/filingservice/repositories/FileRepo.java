package com.codeclan.example.filingservice.repositories;

import com.codeclan.example.filingservice.models.File;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FileRepo extends JpaRepository<File, Long> {
}

