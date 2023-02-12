package com.example.resolver;

import com.example.entity.Student;
import com.example.entity.Subject;
import com.example.response.StudentResponse;
import com.example.response.SubjectResponse;
import graphql.kickstart.tools.GraphQLResolver;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * created by rs 2/2/2023.
 */
@Service
public class StudentResponseResolver implements GraphQLResolver<StudentResponse> {

    public List<SubjectResponse> getLearningSubjects(StudentResponse studentResponse) {

        List<SubjectResponse> learningSubjects = new ArrayList<>();
        Student student = studentResponse.getStudent();

        if (student.getLearningSubjects() != null) {
            for (Subject subject : student.getLearningSubjects()) {
                learningSubjects.add(new SubjectResponse(subject));
            }
        }
        return learningSubjects;
    }
    public String getFullName2 (StudentResponse studentResponse) {
        Student student = studentResponse.getStudent();
        return student.getFirstName() + " " + student.getLastName();
    }
}
