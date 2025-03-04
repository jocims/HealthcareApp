package com.example.healthcareapp.controller;

import com.example.healthcareapp.model.PerformanceReview;
import com.example.healthcareapp.service.PerformanceReviewService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/performancereview")
public class PerformanceReviewAPIController {

    private final PerformanceReviewService performanceReviewService;

    public PerformanceReviewAPIController(PerformanceReviewService performanceReviewService) {
        this.performanceReviewService = performanceReviewService;
    }

    @GetMapping("{id}")
    public PerformanceReview getPerformanceReview(@PathVariable("id") Long id) {
        return performanceReviewService.getById(id);
    }

    @GetMapping
    public List<PerformanceReview> getAllPerformanceReviews() {
        return performanceReviewService.getAll();
    }

    @PostMapping
    public String createPerformanceReview(@RequestBody PerformanceReview performanceReview) {
        performanceReviewService.save(performanceReview);
        return "Performance Review Created Successfully";
    }

    @PutMapping
    public String updatePerformanceReview(@RequestBody PerformanceReview performanceReview) {
        performanceReviewService.save(performanceReview);
        return "Performance Review Updated Successfully";
    }

    @DeleteMapping("{id}")
    public String deletePerformanceReview(@PathVariable("id") Long id) {
        performanceReviewService.delete(id);
        return "Performance Review Deleted Successfully";
    }
}
