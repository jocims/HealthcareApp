package com.example.healthcareapp.controller;

import com.example.healthcareapp.model.Score;
import com.example.healthcareapp.service.ScoreService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/score")
public class ScoreAPIController {

    private final ScoreService scoreService;

    public ScoreAPIController(ScoreService scoreService) {
        this.scoreService = scoreService;
    }

    @GetMapping("{id}")
    public Score getScore(@PathVariable("id") Long id) {
        return scoreService.getById(id);
    }

    @GetMapping
    public List<Score> getAllScores() {
        return scoreService.getAll();
    }

    @PostMapping
    public String createScore(@RequestBody Score score) {
        scoreService.save(score);
        return "Score Created Successfully";
    }

    @PutMapping
    public String updateScore(@RequestBody Score score) {
        scoreService.save(score);
        return "Score Updated Successfully";
    }

    @DeleteMapping("{id}")
    public String deleteScore(@PathVariable("id") Long id) {
        scoreService.delete(id);
        return "Score Deleted Successfully";
    }
}
