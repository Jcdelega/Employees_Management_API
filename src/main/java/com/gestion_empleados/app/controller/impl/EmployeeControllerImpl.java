package com.gestion_empleados.app.controller.impl;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gestion_empleados.app.controller.EmployeeController;
import com.gestion_empleados.app.model.Employee;
import com.gestion_empleados.app.service.EmployeeService;

@CrossOrigin(origins = "*")
@RequestMapping("/api/v1/employee")
@RestController
public class EmployeeControllerImpl implements EmployeeController{

	
	private final EmployeeService employeeService;
	
	public EmployeeControllerImpl(EmployeeService employeeService)  {
		this.employeeService = employeeService;
	}
	@Override
	@GetMapping("{id}")
	public ResponseEntity<Employee> getEmployeeById(@PathVariable("id") Integer id){
		return ResponseEntity.ok(employeeService.getEmployeeById(id));
	}

	@Override
	@GetMapping
	public ResponseEntity<Iterable<Employee>> getAllEmployees() {
		return ResponseEntity.ok(employeeService.getAllEmployees());
	}

	@Override
	@PostMapping
	public ResponseEntity<Employee> createEmployee(@RequestBody Employee newEmployee) {
		return ResponseEntity.ok(employeeService.createEmployee(newEmployee));
	}
	@Override
	@PutMapping("{id}")
	public ResponseEntity<Employee> updateEmployee(@RequestBody Employee employee,@PathVariable("id") Integer id) {
		return ResponseEntity.ok(employeeService.updateEmployee(employee, id));
	}

	@Override
	@DeleteMapping("{id}")
	public ResponseEntity<Employee> deleteEmployee(@PathVariable("id") Integer id) {
		employeeService.deleteEmployee(id);
		return ResponseEntity.noContent().build();
	}
}
