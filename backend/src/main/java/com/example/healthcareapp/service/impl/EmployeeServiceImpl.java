package com.example.healthcareapp.service.impl;

import com.example.healthcareapp.model.Employee;
import com.example.healthcareapp.repository.EmployeeRepository;
import com.example.healthcareapp.service.EmployeeService;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl extends GenericServiceImpl<Employee, Long> implements EmployeeService {

    public EmployeeServiceImpl(EmployeeRepository repository) {
        super(repository);
    }
}