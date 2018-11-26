package com.microservice.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SchoolController {

	@RequestMapping(value="/getSchoolName/{areaName}", method=RequestMethod.GET)
	public String getSchoolName(@PathVariable final String areaName) {
	
		return "Modern";
	}
}
