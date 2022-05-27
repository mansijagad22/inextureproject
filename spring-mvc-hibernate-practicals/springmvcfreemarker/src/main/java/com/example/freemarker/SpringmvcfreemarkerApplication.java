package com.example.freemarker;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.freemarker.model.Employee;
import com.example.freemarker.repository.EmployeeRepository;

@SpringBootApplication
public class SpringmvcfreemarkerApplication implements CommandLineRunner {

	
	@Autowired
	private EmployeeRepository employeeRepository;

	public static void main(String[] args) {
		SpringApplication.run(SpringmvcfreemarkerApplication.class, args);
	}
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub		// get list of employees
		List<Employee> employees = employeeRepository.findAll();
		employees.forEach(employee -> System.out.println(employee.toString()));
		System.out.println(employees);
		
	}

}
