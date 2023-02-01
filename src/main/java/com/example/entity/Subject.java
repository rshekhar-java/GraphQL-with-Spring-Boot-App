package com.example.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

/**
 * created by rs 1/31/2023.
 */
@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name ="subject")
public class Subject {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "subject_name")
    private String subjectName;

    @Column(name = "marks_obtained")
    private Double marksObtained;

    @ManyToOne
    @JoinColumn(name = "student_id")
    private Student student;
}
