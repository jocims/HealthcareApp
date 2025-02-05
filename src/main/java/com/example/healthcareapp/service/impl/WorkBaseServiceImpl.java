package com.example.healthcareapp.service.impl;

import com.example.healthcareapp.model.WorkBase;
import com.example.healthcareapp.repository.WorkBaseRepository;
import com.example.healthcareapp.service.WorkBaseService;
import org.springframework.stereotype.Service;

@Service
public class WorkBaseServiceImpl extends GenericServiceImpl<WorkBase, Integer> implements WorkBaseService {

    public WorkBaseServiceImpl(WorkBaseRepository repository) {
        super(repository);
    }
}
