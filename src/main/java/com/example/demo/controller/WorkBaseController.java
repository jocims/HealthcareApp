package com.example.demo.controller;

import com.example.demo.entity.WorkBase;
import com.example.demo.service.WorkBaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/work-bases")
public class WorkBaseController {

    @Autowired
    private WorkBaseService workBaseService;

    @GetMapping
    public List<WorkBase> getAllWorkBases() {
        return workBaseService.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<WorkBase> getWorkBaseById(@PathVariable Long id) {
        WorkBase workBase = workBaseService.findById(id);
        if (workBase == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(workBase);
    }

    @PostMapping
    public WorkBase createWorkBase(@RequestBody WorkBase workBase) {
        return workBaseService.save(workBase);
    }

    @PutMapping("/{id}")
    public ResponseEntity<WorkBase> updateWorkBase(@PathVariable Long id, @RequestBody WorkBase workBase) {
        WorkBase existingWorkBase = workBaseService.findById(id);
        if (existingWorkBase == null) {
            return ResponseEntity.notFound().build();
        }
        existingWorkBase.setBaseNumber(workBase.getBaseNumber());
        existingWorkBase.setLocation(workBase.getLocation());
        return ResponseEntity.ok(workBaseService.save(existingWorkBase));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteWorkBase(@PathVariable Long id) {
        if (workBaseService.findById(id) == null) {
            return ResponseEntity.notFound().build();
        }
        workBaseService.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}

