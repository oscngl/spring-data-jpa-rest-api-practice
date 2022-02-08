package com.osc.spring_data_jpa_rest_api_practice.api.controllers;

import com.osc.spring_data_jpa_rest_api_practice.business.abstracts.StudentService;
import com.osc.spring_data_jpa_rest_api_practice.entities.concretes.Student;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/students")
@RequiredArgsConstructor
public class StudentsController {

    private final StudentService studentService;

    @PostMapping("/add")
    public void add(@RequestBody Student student) {
        studentService.add(student);
    }

    @GetMapping("/getAll")
    public List<Student> getAll(){
        return studentService.getAll();
    }

    @GetMapping("/getById")
    public Student getById(int id){
        return studentService.getById(id);
    }

    @GetMapping("/getByEmail")
    public Student getByEmail(String email){
        return studentService.getByEmail(email);
    }

}