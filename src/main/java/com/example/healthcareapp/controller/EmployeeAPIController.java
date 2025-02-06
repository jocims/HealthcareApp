package com.example.healthcareapp.controller;

import com.example.healthcareapp.model.Employee;
import com.example.healthcareapp.service.EmployeeService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employee")
public class EmployeeAPIController {

    private final EmployeeService employeeService;

    public EmployeeAPIController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping("{id}")
    public Employee getEmployee(@PathVariable("id") Long id) {
        return employeeService.getById(id);
    }

    @GetMapping
    public List<Employee> getAllEmployees() {
        return employeeService.getAll();
    }

    @PostMapping
    public String createEmployee(@RequestBody Employee employee) {
        employeeService.save(employee);
        return "Employee Created Successfully";
    }

    @PutMapping
    public String updateEmployee(@RequestBody Employee employee) {
        employeeService.save(employee);
        return "Employee Updated Successfully";
    }

    @DeleteMapping("{id}")
    public String deleteEmployee(@PathVariable("id") Long id) {
        employeeService.delete(id);
        return "Employee Deleted Successfully";
    }
}
