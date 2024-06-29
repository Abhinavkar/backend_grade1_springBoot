package com.example.backend_grade1.student;

import jakarta.persistence.*;
import org.springframework.web.bind.annotation.GetMapping;

import java.lang.reflect.Constructor;

@Entity

@Table
public class Student {
    @Id
    @SequenceGenerator(
            name = "student_sequence",
            sequenceName = "student_sequence",
            allocationSize=1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,generator = "student_sequence"
    )
    private Long id;
    private String name;
    private Integer age;
    private int rollNo ;

    public Student(Long id, String name, Integer age, int rollNo) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.rollNo = rollNo;
    }

    public Student(int rollNo, Integer age, String name) {
        this.rollNo = rollNo;
        this.age = age;
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public Integer getAge() {
        return age;
    }

    public int getRollNo() {
        return rollNo;
    }

    public Student() {
    }
}
