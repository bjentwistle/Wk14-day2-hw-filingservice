package com.codeclan.example.filingservice.repositories;

import com.codeclan.example.filingservice.models.Folder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FolderRepo extends JpaRepository<Folder, Long> {
}

