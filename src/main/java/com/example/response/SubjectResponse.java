package com.example.response;

import com.example.entity.Subject;
import lombok.Getter;
import lombok.Setter;

/**
 * created by rs 1/31/2023.
 */
@Getter
@Setter
public class SubjectResponse {
    private Long id;

    private String subjectName;

    private Double marksObtained;

    public SubjectResponse (Subject subject) {
        this.id = subject.getId();
        this.subjectName = subject.getSubjectName();
        this.marksObtained = subject.getMarksObtained();
    }
}
