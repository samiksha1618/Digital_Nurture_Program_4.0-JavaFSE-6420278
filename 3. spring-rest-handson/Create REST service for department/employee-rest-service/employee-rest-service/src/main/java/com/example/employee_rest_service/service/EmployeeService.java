package com.example.employee_rest_service.service;

import com.example.employee_rest_service.dao.EmployeeDao;
import com.example.employee_rest_service.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeDao employeeDao;

    public List<Employee> getAllEmployees() {
        return employeeDao.getEmployeeList();
    }
}
