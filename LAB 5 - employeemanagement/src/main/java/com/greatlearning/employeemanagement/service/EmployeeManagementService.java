package com.greatlearning.employeemanagement.service;

import java.util.List;

import com.greatlearning.employeemanagement.model.Employee;

public interface EmployeeManagementService {
	
	Employee getEmployeeById(int id);

	List<Employee> getAllEmployees();

	Employee insertAnEmployee(Employee employee);

	Employee updateEmployeeDetails(int id, Employee employee);

	void deleteAnEmployee(int id);

}