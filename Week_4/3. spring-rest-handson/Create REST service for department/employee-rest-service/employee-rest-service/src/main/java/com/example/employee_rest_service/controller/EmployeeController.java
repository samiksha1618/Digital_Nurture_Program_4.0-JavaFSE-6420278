// src/main/java/com/example/employee_rest_service/controller/EmployeeController.java

package com.example.employee_rest_service.controller;

import com.example.employee_rest_service.model.Employee;
import com.example.employee_rest_service.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/employees")
    public List<Employee> getAllEmployees() {
        return employeeService.getAllEmployees();
    }
}
