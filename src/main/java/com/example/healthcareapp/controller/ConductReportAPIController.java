package com.example.healthcareapp.controller;

import com.example.healthcareapp.model.ConductReport;
import com.example.healthcareapp.service.ConductReportService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/conductreport")
public class ConductReportAPIController {

    private final ConductReportService conductReportService;

    public ConductReportAPIController(ConductReportService conductReportService) {
        this.conductReportService = conductReportService;
    }

    @GetMapping("{id}")
    public ConductReport getConductReport(@PathVariable("id") Long id) {
        return conductReportService.getById(id);
    }

    @GetMapping
    public List<ConductReport> getAllConductReports() {
        return conductReportService.getAll();
    }

    @PostMapping
    public String createConductReport(@RequestBody ConductReport conductReport) {
        conductReportService.save(conductReport);
        return "Conduct Report Created Successfully";
    }

    @PutMapping
    public String updateConductReport(@RequestBody ConductReport conductReport) {
        conductReportService.save(conductReport);
        return "Conduct Report Updated Successfully";
    }

    @DeleteMapping("{id}")
    public String deleteConductReport(@PathVariable("id") Long id) {
        conductReportService.delete(id);
        return "Conduct Report Deleted Successfully";
    }
}
