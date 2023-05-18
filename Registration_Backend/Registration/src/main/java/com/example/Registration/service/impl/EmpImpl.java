package com.example.Registration.service.impl;

import com.example.Registration.entity.Employee;
import com.example.Registration.repository.EmpRepo;
import com.example.Registration.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmpImpl implements EmpService {
    @Autowired
    private EmpRepo repo;

    @Override
    public List<Employee> getAllEmployee() {
        return repo.findAll();
    }

    @Override
    public Employee addEmp(Employee employee) {
        return repo.save(employee);
    }
}
