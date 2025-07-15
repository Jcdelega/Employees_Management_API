package com.gestion_empleados.app.service;

import com.gestion_empleados.app.model.Employee;

public interface EmployeeService {
	Employee createEmployee( Employee employee);
	Iterable<Employee> getAllEmployees();
	Employee getEmployeeById(Integer id);
	Employee updateEmployee( Employee employee, Integer id);
	void deleteEmployee( Integer id);
}
