package com.codeclan.example.filingservice.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.List;


@Entity
@Table(name = "files")
public class File {
    @Column(name = "file_name")
    private String fileName;
    @Column(name = "extension")
    private String extension;

    @Column(name = "size_Kb")
    private int sizeKb;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    @ManyToOne
    @JoinColumn(name = "folder_id", nullable = false)
    private Folder folder;

    public File() {
    }


    public File(String fileName, String extension, int sizeKb, Folder folder) {
        this.fileName = fileName;
        this.extension = extension;
        this.sizeKb = sizeKb;
        this.folder = folder;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getExtension() {
        return extension;
    }

    public void setExtension(String extension) {
        this.extension = extension;
    }


    public int getSizeKb() {
        return sizeKb;
    }

    public void setSizeKb(int sizeKb) {
        this.sizeKb = sizeKb;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Folder getFolder() {
        return folder;
    }

    public void setFolder(Folder folder) {
        this.folder = folder;
    }
}
