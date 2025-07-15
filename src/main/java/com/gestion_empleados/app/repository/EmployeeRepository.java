package com.gestion_empleados.app.repository;

import org.springframework.data.repository.CrudRepository;

import com.gestion_empleados.app.model.Employee;

public interface EmployeeRepository extends CrudRepository<Employee, Integer>{

}
