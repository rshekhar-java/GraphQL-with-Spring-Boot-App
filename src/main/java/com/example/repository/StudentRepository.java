package com.example.repository;

import com.example.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * created by rs 1/31/2023.
 */
@Repository
public interface StudentRepository extends JpaRepository<Student, Long>{
}
