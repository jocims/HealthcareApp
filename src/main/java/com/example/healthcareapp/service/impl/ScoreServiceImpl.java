package com.example.healthcareapp.service.impl;

import com.example.healthcareapp.model.Score;
import com.example.healthcareapp.repository.ScoreRepository;
import com.example.healthcareapp.service.ScoreService;
import org.springframework.stereotype.Service;

@Service
public class ScoreServiceImpl extends GenericServiceImpl<Score, Long> implements ScoreService {

    public ScoreServiceImpl(ScoreRepository repository) {
        super(repository);
    }

    // If you want to add any Score-specific methods, you can implement them here
}
