package com.osc.spring_data_jpa_rest_api_practice.dataAccess.abstracts;

import com.osc.spring_data_jpa_rest_api_practice.entities.concretes.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentDao extends JpaRepository<Student, Integer> {

    Student findByEmail(String email);

}