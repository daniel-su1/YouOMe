package com.daniel.cruddemo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.daniel.cruddemo.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer>{
}
