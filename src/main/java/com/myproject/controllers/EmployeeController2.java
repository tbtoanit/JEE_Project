package com.myproject.controllers;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.myproject.model.Employee;
import com.myproject.service.EmployeeService;

@RestController
public class EmployeeController2 {

	@Autowired
	EmployeeService employeeService;

	@GetMapping(value = "/api/test1")
	public ResponseEntity<List<Employee>> getEmployees1() {
		List<Employee> employees = employeeService.getAllEmployees();
		ModelAndView model = new ModelAndView("getEmployees");
		model.addObject("employees", employees);
		return new ResponseEntity<>(employees, HttpStatus.OK);
	}

}
