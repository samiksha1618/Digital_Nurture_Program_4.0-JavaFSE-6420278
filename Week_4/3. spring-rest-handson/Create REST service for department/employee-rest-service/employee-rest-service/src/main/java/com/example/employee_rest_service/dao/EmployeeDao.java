package com.example.employee_rest_service.dao;

import com.example.employee_rest_service.model.Employee;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class EmployeeDao {
    private List<Employee> employeeList;

    public void setEmployeeList(List<Employee> employeeList) {
        this.employeeList = employeeList;
    }

    public List<Employee> getEmployeeList() {
        return employeeList;
    }
}
