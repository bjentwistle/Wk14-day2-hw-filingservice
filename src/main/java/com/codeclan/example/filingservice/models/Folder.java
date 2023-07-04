package com.codeclan.example.filingservice.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
@Entity
@Table(name = "folders")
public class Folder {
    @Column(name = "title")
    private String title;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "person_id", nullable = false)
    private Person person;
    @OneToMany(mappedBy = "folder", fetch = FetchType.LAZY)
    @JsonIgnoreProperties({"folder"})
    @Column(name = "files")
    private List<File> files;

    public Folder() {
    }

    public Folder(String title, Person person) {
        this.title = title;
        this.person = person;
        this.files = new ArrayList<>();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<File> getFiles() {
        return files;
    }

    public void setFiles(List<File> files) {
        this.files = files;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
