package com.example.response;

import com.example.entity.Student;
import com.example.entity.Subject;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

/**
 * created by rs 1/31/2023.
 */
@Getter
@Setter
public class StudentResponse {
    private long id;

    private String firstName;

    private String lastName;

    private String email;

    private String street;

    private String city;

    private List<SubjectResponse> learningSubjects;
    public StudentResponse (Student student) {
        this.id = student.getId();
        this.firstName = student.getFirstName();
        this.lastName = student.getLastName();
        this.email = student.getEmail();

        this.street = student.getAddress().getStreet();
        this.city = student.getAddress().getCity();

        if (student.getLearningSubjects() != null) {
            learningSubjects = new ArrayList<SubjectResponse>();
            for (Subject subject: student.getLearningSubjects()) {
                learningSubjects.add(new SubjectResponse(subject));
            }
        }
    }

}
