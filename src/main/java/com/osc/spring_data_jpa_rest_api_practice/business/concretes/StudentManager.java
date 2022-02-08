package com.osc.spring_data_jpa_rest_api_practice.business.concretes;

import com.osc.spring_data_jpa_rest_api_practice.business.abstracts.StudentService;
import com.osc.spring_data_jpa_rest_api_practice.dataAccess.abstracts.StudentDao;
import com.osc.spring_data_jpa_rest_api_practice.entities.concretes.Student;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class StudentManager implements StudentService {

    private final StudentDao studentDao;

    @Override
    public void add(Student student) {
        studentDao.save(student);
    }

    @Override
    public List<Student> getAll() {
        return studentDao.findAll();
    }

    @Override
    public Student getById(int id) {
        return studentDao.findById(id).get();
    }

    @Override
    public Student getByEmail(String email) {
        return studentDao.findByEmail(email);
    }

}