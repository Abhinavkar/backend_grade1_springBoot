package com.example.backend_grade1.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path="api/v1/student")
public class StudentController {

	private final StudentService studentService;


	@Autowired
	public StudentController(StudentService studentService){//dependency Injection for this we have used Autowired
		this.studentService=studentService;
	}

    @GetMapping
	public List<Student> getStudentInfo() {
		return studentService.getStudentInfo();
	}
}
