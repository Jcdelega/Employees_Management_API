package com.gestion_empleados.app.service.impl;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.gestion_empleados.app.model.Employee;
import com.gestion_empleados.app.repository.EmployeeRepository;
import com.gestion_empleados.app.service.EmployeeService;


@Service
public class EmployeeServiceImpl implements EmployeeService{
	
	private final EmployeeRepository employeeRepository;
	
	public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
		this.employeeRepository = employeeRepository;
	}

	@Override
	public Employee createEmployee(Employee newEmployee) {
		return employeeRepository.save(newEmployee);
	}

	@Override
	public Iterable<Employee> getAllEmployees() {
		return employeeRepository.findAll();
	}

	@Override
	public Employee getEmployeeById(Integer id) {
		Optional<Employee> existingEmployee = employeeRepository.findById(id);
		return existingEmployee.orElseThrow(() ->
				new IllegalStateException("Employee does not exist wit id: " + id));
	}

	@Override
	public Employee updateEmployee(Employee employee, Integer id) {
		if (id == null) {
            throw new IllegalArgumentException("This ID does not exist");
        } if (employee == null) {
            throw new IllegalArgumentException("The user object can not be null");
        }
        Employee existingEmployee = getEmployeeById(id);
        if(employee.getName() != null) {
            existingEmployee.setName(employee.getName() );
            } 
        if (employee.getFatherLastName() != null) {
            existingEmployee.setFatherLastName(employee.getFatherLastName());
            } 
        if (employee.getMotherLastName() != null) {
            existingEmployee.setMotherLastName(employee.getMotherLastName());
            } 
        if (employee.getCompany() != null) {
            existingEmployee.setCompany(employee.getCompany() );
            } 
        if (employee.getGender() != null) {
            existingEmployee.setGender(employee.getGender());
            } 
        if (employee.getBirthdate() != null) {
        	existingEmployee.setBirthdate(employee.getBirthdate());
        }
        if (employee.getCountr() != null) {
        	existingEmployee.setCountr(employee.getCountr());
        }
        if (employee.getState() != null) {
        	existingEmployee.setState(employee.getState());
        }
        if (employee.getCurp() != null) {
        	existingEmployee.setCurp(employee.getCurp());
        }
        if (employee.getRfc() != null) {
        	existingEmployee.setRfc(employee.getRfc());
        }
        try {
            return employeeRepository.save(existingEmployee);
            } 
        catch (Exception e) {
                throw new RuntimeException("Error updating employee");
            }
	}

	@Override
	public void deleteEmployee(Integer id) {
		if(id == null || id <= 0) {
			throw new IllegalStateException("Unvalid id");
		}
		Optional<Employee> employeeOptional = employeeRepository.findById(id);
		if(employeeOptional.isPresent()) {
			employeeRepository.deleteById(id);
		}else {
			throw new IllegalStateException("The user doesn't exist");
		}
	
	}
}
