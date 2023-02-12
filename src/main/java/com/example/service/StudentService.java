package com.example.service;

import com.example.entity.Student;
import com.example.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.stereotype.Service;

/**
 * created by rs 1/31/2023.
 */
@Service
public class StudentService {

    @Autowired
    StudentRepository studentRepository;

    public Student getStudentById (@Argument int id) {
        return studentRepository.findById(id).get();
    }

}
