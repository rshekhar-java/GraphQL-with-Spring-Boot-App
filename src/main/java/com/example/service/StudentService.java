package com.example.service;

import com.example.entity.Student;
import com.example.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * created by rs 1/31/2023.
 */
@Service
public class StudentService {

    @Autowired
    StudentRepository studentRepository;

    public Student getStudentById (long id) {
        return studentRepository.findById(id).get();
    }

}
