package com.gestion_empleados.app.controller;

import org.springframework.http.ResponseEntity;

import com.gestion_empleados.app.model.Employee;

public interface EmployeeController {
	
	ResponseEntity<Iterable<Employee>> getAllEmployees();
	ResponseEntity<Employee> getEmployeeById( Integer id);
	ResponseEntity<Employee> createEmployee( Employee newEmployee );
	ResponseEntity<Employee> updateEmployee( Employee employee, Integer id);
	ResponseEntity<Employee> deleteEmployee( Integer id);
	
}
