package com.example.demo.service;

import com.example.demo.entity.WorkBase;
import com.example.demo.repository.WorkBaseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WorkBaseService {

    @Autowired
    private WorkBaseRepository workBaseRepository;

    public List<WorkBase> findAll() {
        return workBaseRepository.findAll();
    }

    public WorkBase findById(Long id) {
        return workBaseRepository.findById(id).orElse(null);
    }

    public WorkBase save(WorkBase workBase) {
        return workBaseRepository.save(workBase);
    }

    public void deleteById(Long id) {
        workBaseRepository.deleteById(id);
    }
}
