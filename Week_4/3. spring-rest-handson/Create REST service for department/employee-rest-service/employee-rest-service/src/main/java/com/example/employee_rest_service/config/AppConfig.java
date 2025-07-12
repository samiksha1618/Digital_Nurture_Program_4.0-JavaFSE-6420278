package com.example.employee_rest_service.config;

import com.example.employee_rest_service.dao.EmployeeDao;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@Configuration
public class AppConfig {

    @Bean
    public EmployeeDao employeeDao() {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("employee.xml");
        return (EmployeeDao) context.getBean("employeeDao");
    }
}
