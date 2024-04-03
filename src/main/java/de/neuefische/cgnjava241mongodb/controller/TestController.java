package de.neuefische.cgnjava241mongodb.controller;

import de.neuefische.cgnjava241mongodb.Student;
import de.neuefische.cgnjava241mongodb.repository.TestRepository;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Repository
public interface TestController extends MongoRepository<Student, String> {


}
