package com.example.query;

import com.example.request.SampleRequest;
import com.example.response.StudentResponse;
import com.example.service.StudentService;
import graphql.kickstart.tools.GraphQLQueryResolver;
import graphql.kickstart.tools.GraphQLResolver;
import jakarta.persistence.Id;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Component;


import org.springframework.stereotype.Controller;

@Component
@Controller
public class Query implements GraphQLQueryResolver {

	@QueryMapping
	public String firstQuery() {
		return "First Query";
	}

	@QueryMapping
	public String secondQuery() {
		return "Second Query";
	}

	//Passing Input Data  to GraphQL Query
	@QueryMapping
	public String fullName(@Argument String firstName,@Argument String lastName){
		return firstName+" "+lastName;
	}

	//JSON Inputs For GraphQL Query
	@QueryMapping
	public String fullName1(@Argument SampleRequest sampleRequest){
		return sampleRequest.getFirstName()+ " "+sampleRequest.getLastName();
 	}

	 @Autowired
	 public StudentService studentService;

	 @QueryMapping
	 public StudentResponse getStudent( @Argument int id){
		return new StudentResponse(studentService.getStudentById(id));
	 }
}
