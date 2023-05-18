package com.example.Registration.service;

import com.example.Registration.entity.Employee;

import java.util.List;

public interface EmpService {
    List<Employee> getAllEmployee();

    Employee addEmp(Employee employee);
}
