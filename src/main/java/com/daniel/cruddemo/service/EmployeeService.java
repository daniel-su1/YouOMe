package com.daniel.cruddemo.service;

import java.util.List;
import com.daniel.cruddemo.entity.Employee;

public interface EmployeeService {
    List<Employee> findAll();

    Employee findById(int theId);

    Employee save(Employee theEmployee);

    void deleteById(int theId);
}
