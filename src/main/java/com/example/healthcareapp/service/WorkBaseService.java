package com.example.healthcareapp.service;

import com.example.healthcareapp.model.WorkBase;

import java.util.List;

public interface WorkBaseService  {

    public String createWorkBase(WorkBase workBase);
    public String updateWorkBase(WorkBase workBase);
    public String deleteWorkBase(Integer workBaseId);
    public WorkBase getWorkBase(Integer workBaseId);
    public List<WorkBase> getAllWorkBases();

}
