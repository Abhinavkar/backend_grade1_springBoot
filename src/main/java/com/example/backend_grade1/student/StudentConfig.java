package com.example.backend_grade1.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class StudentConfig {
    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository){
        return args ->{
            Student abhinavKar = new Student(
                    14,
                    24,
                    "Abhinav Kar"
            );
            Student alex = new Student(

                    14,
                    24,
                    "Alex"
            );
            repository.saveAll(List.of(abhinavKar,alex));
        };
    }
}
