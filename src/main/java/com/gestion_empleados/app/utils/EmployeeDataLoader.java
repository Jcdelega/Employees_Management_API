package com.gestion_empleados.app.utils;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.gestion_empleados.app.model.Employee;
import com.gestion_empleados.app.repository.EmployeeRepository;

@Component
public class EmployeeDataLoader implements CommandLineRunner{
	@Autowired 
	EmployeeRepository employeeRepository;
	@Override
	public void run(String... args) throws Exception {
		employeeRepository.save(new Employee("Carls","Junior","Junior","Prolosys","Male",LocalDate.of(2025, 07, 15),"México","CDMX","123456789101213148","0123456789111"));
		employeeRepository.save(new Employee("Freddie", "Mercury", "Lead Vocalist", "Queen", "Male", LocalDate.of(1991, 11, 24), "United Kingdom", "London", "987654321012345678", "1122334455667"));
		employeeRepository.save(new Employee("Whitney", "Houston", "Singer", "Arista", "Female", LocalDate.of(2012, 02, 11), "United States", "Newark", "123456789000000000", "9876543211234"));
		employeeRepository.save(new Employee("Michael", "Jackson", "King of Pop", "Epic", "Male", LocalDate.of(2009, 06, 25), "United States", "Los Angeles", "999888777666555444", "7766554433221"));
		employeeRepository.save(new Employee("Amy", "Winehouse", "Singer", "Island Records", "Female", LocalDate.of(2011, 07, 23), "United Kingdom", "London", "123123123123123123", "5544332211009"));
		employeeRepository.save(new Employee("Elvis", "Presley", "Rock Legend", "RCA", "Male", LocalDate.of(1977, 8, 16), "United States", "Memphis", "444555666777888999", "6677889900112"));
		employeeRepository.save(new Employee("Kurt", "Cobain", "Guitarist", "Nirvana", "Male", LocalDate.of(1994, 04, 05), "United States", "Seattle", "321321321321321321", "9988776655443"));
		employeeRepository.save(new Employee("Janis", "Joplin", "Singer", "Big Brother", "Female", LocalDate.of(1970, 10, 04), "United States", "Los Angeles", "111222333444555666", "8877665544332"));
		employeeRepository.save(new Employee("John", "Lennon", "Singer", "The Beatles", "Male", LocalDate.of(1980, 12, 8), "United States", "New York", "777888999000111222", "2211009988776"));
		employeeRepository.save(new Employee("Aretha", "Franklin", "Soul Queen", "Atlantic", "Female", LocalDate.of(2018, 8, 16), "United States", "Detroit", "159753486213579642", "3344556677889"));
		employeeRepository.save(new Employee("Prince", "Nelson", "Musician", "NPG", "Male", LocalDate.of(2016, 04, 21), "United States", "Minneapolis", "741852963074185296", "4433221100998"));

	}

}
