package de.neuefische.cgnjava241mongodb.repository;

import de.neuefische.cgnjava241mongodb.Student;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public interface TestRepository extends MongoRepository<Student, String> {

    List<Student> findAllByAgeAndName(int age, String name);
}
