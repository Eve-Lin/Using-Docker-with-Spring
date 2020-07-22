package com.evelin.docker.docker.student;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentController {


    private final StudentRepository studentRepository;

    public StudentController(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @GetMapping("/")
    public ResponseEntity<List<Student>> getAllStudents(){
        return ResponseEntity.ok(studentRepository.findAll());
    }
}


