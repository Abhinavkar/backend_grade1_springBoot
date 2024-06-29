package com.example.backend_grade1.student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    private final StudentRepository studentRepository;
    @Autowired
    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }
//
//    public List<Student> getStudentInfo(){
//        return List.of(new Student(
//                1L,
//                "AbhinavKar",
//                24,
//                14));
//    }
    public List<Student>getStudentInfo(){
        return studentRepository.findAll();
    }
}
