package com.in28Minutes.courses.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.in28Minutes.courses.bean.Course;

@RestController
public class CourseController {
	
	@GetMapping(value="/courses")
	public List<Course> getAllCourses()
	{
		return Arrays.asList(new Course(1, "Learn Microservices", "in28Minutes"));
	}

}
