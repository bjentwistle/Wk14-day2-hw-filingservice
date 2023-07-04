package com.codeclan.example.filingservice.others;

import com.codeclan.example.filingservice.models.File;
import com.codeclan.example.filingservice.models.Folder;
import com.codeclan.example.filingservice.models.Person;
import com.codeclan.example.filingservice.repositories.FileRepo;
import com.codeclan.example.filingservice.repositories.FolderRepo;
import com.codeclan.example.filingservice.repositories.PersonRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Profile("!test")
@Component //Comment this out if you do not to run the data loader.
public class DataLoader implements ApplicationRunner {

    @Autowired
    PersonRepo personRepo;

    @Autowired
    FolderRepo folderRepo;

    @Autowired
    FileRepo fileRepo;

    public DataLoader() {

    }

    public void run(ApplicationArguments args) {

        Person person1 = new Person("Sara Cox");
        personRepo.save(person1);

        Folder personal = new Folder("Personal", person1);
        folderRepo.save(personal);

        File cvUpdated = new File("CV_updated", ".doc", 700, personal );
        fileRepo.save(cvUpdated);
    }
}
