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
        return workBaseService.getWorkBase(workBaseId);

//        return new WorkBase(
//                workBaseId,
//                123456,
//                "Vitoria",
//                LocalDate.of(2025, 1, 1),
//                LocalDate.of(2025, 1, 2)
//        );
    }

    //Get All Work Bases in DB
    @GetMapping()
    public List<WorkBase> getAllWorkBaseDetails() {
        return workBaseService.getAllWorkBases();
    }

    @PostMapping
    public String createWorkBaseDetails(@RequestBody WorkBase workBase) {
        workBaseService.createWorkBase(workBase);
        return "Work Base Created Successfully";
    }

    @PutMapping
    public String updateWorkBaseDetails(@RequestBody WorkBase workBase) {
        workBaseService.updateWorkBase(workBase);
        return "Work Base Updated Successfully";
    }

    @DeleteMapping("{workBaseId}")
    public String updateWorkBaseDetails(@PathVariable("workBaseId") Integer workBaseId) {
        workBaseService.deleteWorkBase(workBaseId);
        return "Work Base Deleted Successfully";
    }


}
