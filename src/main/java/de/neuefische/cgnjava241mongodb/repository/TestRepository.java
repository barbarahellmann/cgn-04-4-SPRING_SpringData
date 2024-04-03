package de.neuefische.cgnjava241mongodb.repository;

import de.neuefische.cgnjava241mongodb.Student;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TestRepository {
    Map<String, Student> studentMap = new HashMap<>();

    public Student getStudentById(String id){
        return studentMap.get(id);
    }

    public List<Student> getAllStudents(){
        return new ArrayList<>(studentMap.values());
    }

    public void saveStudent(Student student){
        studentMap.put(student.id(), student);
    }

    public void deleteStudent(String id){
        studentMap.remove(id);
    }
}
