package com.example.query;

import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Component;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
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
}
