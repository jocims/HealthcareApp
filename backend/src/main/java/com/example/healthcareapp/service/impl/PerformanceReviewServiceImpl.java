package com.example.healthcareapp.service.impl;

import com.example.healthcareapp.model.PerformanceReview;
import com.example.healthcareapp.repository.PerformanceReviewRepository;
import com.example.healthcareapp.service.PerformanceReviewService;
import org.springframework.stereotype.Service;

@Service
public class PerformanceReviewServiceImpl extends GenericServiceImpl<PerformanceReview, Long> implements PerformanceReviewService {

    public PerformanceReviewServiceImpl(PerformanceReviewRepository repository) {
        super(repository);
    }
}
