package com.example.Employees.controller;

import com.example.Employees.entity.Employee;
import com.example.Employees.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;


    @PostMapping("/save")
    public Employee saveEmployee(@RequestBody Employee employee){
        return employeeService.saveEmployee(employee);
    }

    @GetMapping("/all")
    public List<Employee> getEmployees(){
        return employeeService.getEmployees();
    }

    @GetMapping("/welcome")
    public String welcome(){
        return employeeService.welcome();
    }
}
