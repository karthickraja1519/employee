package com.employeejpa.data.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


import com.employeejpa.data.model.Employee;
import com.employeejpa.data.serviceImpl.EmployeeServiceImpl;

@RestController
public class EmployeeeController {

	@Autowired
	EmployeeServiceImpl EmployeeServiceImpl;
	
	
	@RequestMapping(value="/getemployeedata" , method = RequestMethod.GET)
	public List<Employee> getEmployee() {
		List<Employee> empList = EmployeeServiceImpl.getAllEmployees();
		return empList;
	}


}
