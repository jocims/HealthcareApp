package com.example.healthcareapp.service.impl;

import com.example.healthcareapp.model.WorkBase;
import com.example.healthcareapp.repository.WorkBaseRepository;
import com.example.healthcareapp.service.WorkBaseService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WorkBaseServiceimpl implements WorkBaseService {

    WorkBaseRepository workBaseRepository;

    public WorkBaseServiceimpl(WorkBaseRepository workBaseRepository) {
        this.workBaseRepository = workBaseRepository;
    }

    @Override
    public String createWorkBase(WorkBase workBase) {
        workBaseRepository.save(workBase);
        return "Success";
    }

    @Override
    public String updateWorkBase(WorkBase workBase) {
        workBaseRepository.save(workBase);
        return "Success";
    }

    @Override
    public String deleteWorkBase(Integer workBaseId) {
        workBaseRepository.deleteById(workBaseId);
        return "Success";
    }

    @Override
    public WorkBase getWorkBase(Integer workBaseId) {
        return workBaseRepository.findById(workBaseId).get();
    }

    @Override
    public List<WorkBase> getAllWorkBases() {
        return workBaseRepository.findAll();
    }
}
