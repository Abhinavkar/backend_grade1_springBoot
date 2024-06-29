package com.example.backend_grade1;

import com.example.backend_grade1.student.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@SpringBootApplication
@RestController
public class BackendGrade1Application {

	public static void main(String[] args) {
		SpringApplication.run(BackendGrade1Application.class, args);
	}
//	@GetMapping
//	public String helloWorld(){
//		return "Hello World";
//	}

//	@GetMapping
//	public List<String> HelloWorld(){
//		return List.of("hello", "World");
//	}
//	@GetMapping
//	public List<Student>StudentInfo(){
//		 return List.of(new Student(1L,"AbhinavKar",24,14));
//	}
}
