package de.neuefische.cgnjava241mongodb.controller;

import de.neuefische.cgnjava241mongodb.Student;
import de.neuefische.cgnjava241mongodb.repository.TestRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//wlVOUFIfBRQBqhpP
@RestController
@RequestMapping("/api/students")
public class TestController {

    TestRepository repo = new TestRepository();

    @GetMapping
    public List<Student> getAllStudents(){
        return repo.getAllStudents();
    }

    @GetMapping("/{id}")
    public Student getStudentById(@PathVariable String id){
        return repo.getStudentById(id);
    }

    @PostMapping
    public void saveNewStudent(@RequestBody Student student){
        repo.saveStudent(student);
    }

    @DeleteMapping("/{id}")
    public void deleteStudentById(@PathVariable String id){
        repo.deleteStudent(id);
    }
}
