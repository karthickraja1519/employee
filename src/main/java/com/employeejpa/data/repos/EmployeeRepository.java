package com.employeejpa.data.repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.employeejpa.data.model.Employee;



@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer>{

	//List<Employee> findAll();

}
