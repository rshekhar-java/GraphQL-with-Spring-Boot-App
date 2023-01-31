package com.example.request;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import lombok.Getter;
import lombok.Setter;

/**
 * created by rs 1/30/2023.
 */
@Getter
@Setter
@JsonAutoDetect
public class SampleRequest {

    private String firstName;
    private String lastName;
}
