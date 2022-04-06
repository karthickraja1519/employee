package com.employeejpa.data.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;


import com.employeejpa.data.model.Employee;
import com.employeejpa.data.repos.EmployeeRepository;
import com.employeejpa.data.service.EmployeeService;


@Component
public class EmployeeServiceImpl implements EmployeeService{
	
	@Autowired
	EmployeeRepository employeeRepo;
//
	@Override
	public List<Employee> getAllEmployees() {
		List<Employee> employeeList = employeeRepo.findAll();
		return employeeList;
	}
//  @Autowired
//  RestTemplate restTemplate;
//  
//  public List<Address> callEmployeeServiceAndGetData(){
//	  
//	  System.out.println("Getting Employee details from  external service");
//	  
//	  List<Address> response = restTemplate.exchange("https://localhost:8082/address"
//			  ,HttpMethod.GET
//			  ,null
//			  ,new ParameterizedTypeReference<List<Address>>() {
//			}).getBody();
//	  
//	  
//	  return response;
//  }

}
