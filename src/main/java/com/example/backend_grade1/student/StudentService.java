package com.example.backend_grade1.student;

import java.util.List;

public class StudentService {
    public List<Student> getStudentInfo(){
        return List.of(new Student(
                1L,
                "AbhinavKar",
                24,
                14));
    }
}
