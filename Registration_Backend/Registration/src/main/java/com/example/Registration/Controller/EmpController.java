package com.example.Registration.Controller;

import com.example.Registration.entity.Employee;
import com.example.Registration.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/api/v1/emp")
public class EmpController {
    @Autowired
    private EmpService service;
    @GetMapping
    public List<Employee> getAllEmployee() {
        return service.getAllEmployee();
    }
    @PostMapping
    public Employee addEmp(
            @RequestBody Employee employee
    ) {
        return service.addEmp(employee);
    }
}
