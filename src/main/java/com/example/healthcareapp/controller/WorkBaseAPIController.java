package com.example.healthcareapp.controller;

import com.example.healthcareapp.model.WorkBase;
import com.example.healthcareapp.service.WorkBaseService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/workbase")
public class WorkBaseAPIController {

    WorkBaseService workBaseService;

    public WorkBaseAPIController(WorkBaseService workBaseService) {
        this.workBaseService = workBaseService;
    }

    //Specific WorkBase
    @GetMapping("{workBaseId}")
    public WorkBase getWorkBaseDetails(@PathVariable("workBaseId") Integer workBaseId) {
        return workBaseService.getById(workBaseId);
    }

    //Get All Work Bases in DB
    @GetMapping()
    public List<WorkBase> getAllWorkBaseDetails() {
        return workBaseService.getAll();
    }

    @PostMapping
    public String createWorkBaseDetails(@RequestBody WorkBase workBase) {
        workBaseService.save(workBase);
        return "Work Base Created Successfully";
    }

    @PutMapping
    public String updateWorkBaseDetails(@RequestBody WorkBase workBase) {
        workBaseService.save(workBase);
        return "Work Base Updated Successfully";
    }

    @DeleteMapping("{workBaseId}")
    public String updateWorkBaseDetails(@PathVariable("workBaseId") Integer workBaseId) {
        workBaseService.delete(workBaseId);
        return "Work Base Deleted Successfully";
    }
}
