package com.example.healthcareapp.controller;

import com.example.healthcareapp.model.WorkBase;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;

@RestController
@RequestMapping("/workbase")
public class WorkBaseAPIService {

    WorkBase workBase;

    @GetMapping("{workBaseId}")
    public WorkBase getWorkBaseDetails(@PathVariable Integer workBaseId) {
        return workBase;

//        return new WorkBase(
//                workBaseId,
//                123456,
//                "Vitoria",
//                LocalDate.of(2025, 1, 1),
//                LocalDate.of(2025, 1, 2)
//        );
    }

    @PostMapping
    public String createWorkBaseDetails(@RequestBody WorkBase workBase) {
        this.workBase = workBase;
        return "Work Base Created Successfully";
    }

    @PutMapping
    public String updateWorkBaseDetails(@RequestBody WorkBase workBase) {
        this.workBase = workBase;
        return "Work Base Updated Successfully";
    }

    @DeleteMapping("{workBaseId}")
    public String updateWorkBaseDetails(@PathVariable Integer workBaseId) {
        this.workBase = null;
        return "Work Base Deleted Successfully";
    }


}
