package com.example.backend_grade1.student;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    public List<Student> getStudentInfo(){
        return List.of(new Student(
                1L,
                "AbhinavKar",
                24,
                14));
    }
}
