package com.example.freemarker.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.freemarker.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer>{

}
