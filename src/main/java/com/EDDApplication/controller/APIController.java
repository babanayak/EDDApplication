package com.EDDApplication.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.EDDApplication.entity.CPTObj;
import com.EDDApplication.entity.Holiday;
import com.EDDApplication.entity.TransitObj;
import com.EDDApplication.service.EDDApplicationservice;

/*Controller maps the REST Api's to the defined methods*/

@RestController
public class APIController {
	@Autowired
	private EDDApplicationservice service;
	//holidays API is mapped to it and returns the holidays list by calling the service.
	@GetMapping("/holidays")
	public Holiday holidays_list() {
		return service.get_holidays();
	}
	//CPT API is mapped to it and returns the CPT list by calling the service.
	@GetMapping("/CPT")
	public CPTObj cpt_list() {
		return service.get_CPTlist();
	}
	//Transit API is mapped to it and Returns the Transit list by calling the service.
	@GetMapping("/Transit")
	public TransitObj transit_list() {
		return service.get_transit_time();
	}

}
