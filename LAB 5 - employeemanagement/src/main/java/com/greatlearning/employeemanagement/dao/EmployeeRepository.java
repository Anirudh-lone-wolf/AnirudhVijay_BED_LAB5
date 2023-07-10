package com.greatlearning.employeemanagement.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.greatlearning.employeemanagement.model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}
