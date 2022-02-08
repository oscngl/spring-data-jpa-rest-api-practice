package com.osc.spring_data_jpa_rest_api_practice.business.abstracts;

import com.osc.spring_data_jpa_rest_api_practice.entities.concretes.Student;

import java.util.List;

public interface StudentService {

    void add(Student student);
    List<Student> getAll();
    Student getById(int id);
    Student getByEmail(String email);

}