package com.example.healthcareapp.repository;

import com.example.healthcareapp.model.Score;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ScoreRepository extends JpaRepository<Score, Long> {

}
